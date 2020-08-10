
# Contains functions to produce a clean/easy to process dataframe from the input and 
# output csv files.
# authors: Pouria Derakhshanfar

library(dplyr)


STATUS_LEVELS = c("not reproduced", "reproduced")
TOTAL_RUNS = 30
WINNER_MOHO = "SPEA2"
state_of_the_art <- c("Single","De-MO")
RESULTS_CSV <- "../../crash-reproduction-moho/results/results.csv"
getSingleObjectiveResults <- function(){
  df <- read.csv(RESULTS_CSV, stringsAsFactors = FALSE) %>%
    filter(search_algorithm == "Single_Objective_GGA")
  df$fitness_function_value[df$fitness_function_value<0] <- 6
  df$search_algorithm <- "Single"
  return(df)
}

getNSGAIIResults <- function(){
  df <- read.csv(RESULTS_CSV, stringsAsFactors = FALSE) %>%
    filter(search_algorithm == "NSGA_II" & objectives == "WeightedSum:TestLen:CallDiversity")
  df$fitness_function_value[df$fitness_function_value<0] <- 6
  df$search_algorithm <- "NSGA_II"
  return(df)
}


getSPEA2Results <- function(){
  df <- read.csv(RESULTS_CSV, stringsAsFactors = FALSE) %>%
    filter(search_algorithm == "SPEA2" & objectives == "WeightedSum:TestLen:CallDiversity")
  df$fitness_function_value[df$fitness_function_value<0] <- 6
  df$search_algorithm <- "SPEA2"
  return(df)
}

getPESAIIResults <- function(){
  df <- read.csv(RESULTS_CSV, stringsAsFactors = FALSE) %>%
    filter(search_algorithm == "PESA_II" & objectives == "WeightedSum:TestLen:CallDiversity")
  df$fitness_function_value[df$fitness_function_value<0] <- 6
  df$search_algorithm <- "PESA_II"
  return(df)
}


getMOEADResults <- function(){
  df <- read.csv(RESULTS_CSV, stringsAsFactors = FALSE) %>%
    filter(search_algorithm == "MOEAD" & objectives == "WeightedSum:TestLen:CallDiversity")
  df$fitness_function_value[df$fitness_function_value<0] <- 6
  df$search_algorithm <- "MOEAD"
  return(df)
}


getFEMOResults <- function(){
  df <- read.csv(RESULTS_CSV, stringsAsFactors = FALSE) %>%
    filter(search_algorithm == "FEMO" & objectives == "WeightedSum:TestLen:CallDiversity")
  df$fitness_function_value[df$fitness_function_value<0] <- 6
  df$search_algorithm <- "FEMO"
  return(df)
}


getMultiObjectivizationResults <- function(){
  df <- read.csv(RESULTS_CSV, stringsAsFactors = FALSE) %>%
    filter(search_algorithm == "NSGA_II" & objectives == "LineCoverage:ExceptionType:StackTraceSimilarity")
  df$fitness_function_value[df$fitness_function_value<0] <- 6
  df$search_algorithm <- "De-MO"
  return(df)
}

getClassesAndMethods <- function(){
  csvFile='../other-data/classes_and_methods.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  return(df)
}

getCleanResults <- function(df){
  dfWithMaxFrame <- df %>%
    filter(!is.na(fitness_function_value)) %>%
    group_by(case, fitness_function_value) %>%
    mutate(max_reproduced = ifelse(fitness_function_value == 0, max(frame_level), 0)) %>%
    ungroup() %>%
    group_by(application,case) %>%
    summarise(max_reproduced = max(max_reproduced))
  
  return(dfWithMaxFrame)
}

getAllResults <- function(){
  df <- union( getNSGAIIResults(), getSPEA2Results())
  df <- union(df, getSingleObjectiveResults())
  df <- union(df, getPESAIIResults())
  df <- union(df, getMOEADResults())
  df <- union(df, getFEMOResults())
  df <- union(df, getMultiObjectivizationResults())
  return(df)
}


getResultsForTime <- function(){
  allResults <- getAllResults()
  df <- allResults %>%
    group_by(case,frame_level) %>%
    summarise(minFF = min(fitness_function_value)) %>%
    filter(minFF == 0)
  
  joined <- allResults %>%
    inner_join(df, by=c('case','frame_level'))
  
  
  joined$time_spent[joined$fitness_function_value>0] <- 299
  
  joined$time_spent <- joined$time_spent + 1
  
  return(joined)
}

#getResultsForFFEval <- function(){
#  allResults <- getAllResults()
#  df <- allResults %>%
#    group_by(case,frame_level) %>%
#    summarise(minFF = min(fitness_function_value)) %>%
#    filter(minFF == 0)
  
# joined <- allResults %>%
#    inner_join(df, by=c('case','frame_level'))
  
  
#  joined$number_of_fitness_evaluations[joined$fitness_function_value>0] <- 250000
  
  
#  return(joined)
#}


getReproduceStatus <- function(){
  
  rawResult <- getAllResults()
  
  df <- rawResult %>%
    group_by(case, search_algorithm, fitness_function_value) %>%
    mutate(max_reproduced = ifelse(fitness_function_value == 0, max(frame_level), 0)) %>%
    ungroup() %>%
    group_by(case, search_algorithm) %>%
    mutate(max_reproduced = max(max_reproduced)) %>%
    ungroup() %>%
    distinct(application, case, search_algorithm, max_reproduced)
  
  df <- data.frame(df) %>%
    group_by(case) %>%
    mutate(highest = max(max_reproduced)) %>%
    ungroup() %>%
    mutate(status = ifelse(max_reproduced > 0 & max_reproduced >= highest, STATUS_LEVELS[2], STATUS_LEVELS[1]))
  
  df <- data.frame(df)
  df$status_factor <- factor(df$status, levels = STATUS_LEVELS, ordered = TRUE)
  
  return(df)
}


getReproductionRate <- function(){
  rawResult <- getAllResults()
  
  df <- getReproduceStatus() %>%
    inner_join(rawResult, by = c("application","case","search_algorithm")) %>%
    filter(frame_level == highest) %>%
    group_by(application,case,exception_name,search_algorithm,highest,status,status_factor) %>%
    filter(fitness_function_value <= min(fitness_function_value)) %>%
    summarise(count = ifelse(status[1] == "reproduced", n(), 0) , 
              reproduction_rate = count/TOTAL_RUNS,
              avg_ff_evals = mean(number_of_fitness_evaluations),
              sd_ff_evals = sd(number_of_fitness_evaluations)) %>%
    data.frame()
  
  
  return(df)
}

getAllCleanResults <- function(){
  singleObjective <- getCleanResults(getSingleObjectiveResults())
  NSGAII <- getCleanResults(getNSGAIIResults())
  SPEA2 <- getCleanResults(getSPEA2Results())
  PESAII <- getCleanResults(getPESAIIResults())
  
  joined_so_spea <- singleObjective %>%
    full_join(SPEA2, by=c('case','application'), suffix = c('.so', '.spea'))
  
  speaWins <- joined_so_spea %>%
    filter(max_reproduced.spea > max_reproduced.so)
  
  soWins <- joined_so_spea %>%
    filter(max_reproduced.spea < max_reproduced.so)
  
  joined_so_pesa <- singleObjective %>%
    full_join(PESAII, by=c('case','application'), suffix = c('.so', '.pesa'))
  
  pesaWins <- joined_so_pesa %>%
    filter(max_reproduced.pesa > max_reproduced.so)
  
  joined_so_nsga <- singleObjective %>%
    full_join(NSGAII, by=c('case','application'), suffix = c('.so', '.nsga'))
  
  nsgaIIWins <- joined_so_nsga %>%
    filter(max_reproduced.nsga > max_reproduced.so)
  
  
  soWins <- joined_so_nsga %>%
    filter(max_reproduced.nsga < max_reproduced.so)
  
  
  df <- bind_rows("so" = singleObjective,"nsga" = NSGAII, .id = "algorithm")
}


getAlgorithms <- function(){
  df <- getAllResults()
  algorithms <- unique(df$search_algorithm)
  
  return(algorithms)
}


getExternalTimeResults <- function(){
  rawResult <- getAllResults() %>%
    filter(search_algorithm %in% c("Single","De-MO",WINNER_MOHO))
  reproduced <- getReproduceStatus() %>%
    rename(frame_level = highest)
  
  df <- rawResult %>%
    inner_join(reproduced, by = c("application", "case", "frame_level", "search_algorithm")) %>%
    mutate(time_spent = ifelse(fitness_function_value == 0, as.integer(time_spent), 300))
  
  return(df)
}


