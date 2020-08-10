library(questionr)
library(effsize)


source('dataclean.r')

SIGNIFICANCE_LEVEL = 0.05




getExternalTimeEffectSizes <- function(){
  df <- getExternalTimeResults()
  df$exception_name
  timeES <- df %>%
    inner_join(df, by=c('case','exception_name', 'frame_level', 'execution_idx'), suffix = c('.alg1', '.alg2')) %>%
    filter(search_algorithm.alg1 != search_algorithm.alg2) %>%
    group_by(case,exception_name,frame_level, search_algorithm.alg1, search_algorithm.alg2) %>%
    summarise(VD.magnitude = VD.A(time_spent.alg1, time_spent.alg2)$magnitude,
              VD.estimate = VD.A(time_spent.alg1, time_spent.alg2)$estimate,
              wilcox.test.pvalue = wilcox.test(time_spent.alg1, time_spent.alg2)$p.value) %>%
    filter(wilcox.test.pvalue <= SIGNIFICANCE_LEVEL) %>%
    mutate(VD.estimate.category = case_when(
      VD.estimate < 0.5 ~ '< 0.5',
      VD.estimate > 0.5 ~ '> 0.5',
      TRUE ~ '= 0.5'
    ))
  
  return(timeES)
}

getTimeEffectSizes <- function(){
  rawResult <- getAllResults()
  reproduced <- getReproduceStatus() %>%
    rename(frame_level = highest)
  
  df <- rawResult %>%
    inner_join(reproduced, by = c("application", "case", "frame_level", "search_algorithm")) %>%
    mutate(time_spent = ifelse(fitness_function_value == 0, as.integer(time_spent), 300))
  
  timeES <- df %>%
    inner_join(df, by=c('case', 'frame_level', 'execution_idx'), suffix = c('.alg1', '.alg2')) %>%
    filter(search_algorithm.alg1 != search_algorithm.alg2) %>%
    group_by(case,frame_level, search_algorithm.alg1, search_algorithm.alg2) %>%
    summarise(VD.magnitude = VD.A(time_spent.alg1, time_spent.alg2)$magnitude,
              VD.estimate = VD.A(time_spent.alg1, time_spent.alg2)$estimate,
              wilcox.test.pvalue = wilcox.test(time_spent.alg1, time_spent.alg2)$p.value) %>%
    filter(wilcox.test.pvalue <= SIGNIFICANCE_LEVEL) %>%
    mutate(VD.estimate.category = case_when(
      VD.estimate < 0.5 ~ '< 0.5',
      VD.estimate > 0.5 ~ '> 0.5',
      TRUE ~ '= 0.5'
    ))
  
  return(timeES)
}


