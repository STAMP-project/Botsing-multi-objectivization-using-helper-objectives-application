source('dataclean.r')
library(ggplot2)

slices <- c(0,60,120,180,240,300)


source('dataclean.r')
library(ggplot2)
state_of_the_art <- c("Single","De-MO")

slices <- c(0,60,120,180,240,300)

# Figure 1
df <- getExternalTimeResults()


for (index in 2:length(slices)-1){
  min = slices[index]
  max = slices[index+1]
  
  tempDf <- df %>% 
    filter(search_algorithm %in% c("De-MO", "Single", WINNER_MOHO)) %>%
    mutate(reproduced_on_time = ifelse(time_spent < max, 1,0)) %>%
    group_by(application, case, exception_name, frame_level, search_algorithm) %>%
    summarise(count = sum(reproduced_on_time), reproduction_ratio = sum(reproduced_on_time)/30) %>%
    mutate(time_interval = paste(max,"seconds budget"))
  
  if (index == 1){
    finalDF<-data.frame(tempDf)
  }else{
    finalDF<-bind_rows(finalDF, tempDf)
  }
}
finalDF$time_interval <- factor(finalDF$time_interval,levels = c(paste(60,"seconds budget"),paste(120,"seconds budget"),paste(180,"seconds budget"),paste(240,"seconds budget"),paste(300,"seconds budget")))
finalDF$search_algorithm <- ifelse(finalDF$search_algorithm == WINNER_MOHO,"MO-HO",finalDF$search_algorithm)


ggplot(finalDF, aes(x = search_algorithm, y = reproduction_ratio)) +
  geom_boxplot() +
  stat_summary(fun.y=mean,pch=22, size = 3, geom='point') +
  facet_wrap(~time_interval, scales="free", ncol = 5) +
  ylab("Reproduction Ratio (percent)") + xlab("Algorithms") +
  theme(text = element_text(size=15),axis.text.x = element_text(size=11))

ggsave("../figures/rq2-reproduction-overall.pdf", width = 15, height = 5)

# interquartile Range for Figure 1
interquartileRange <- finalDF %>%
  group_by(search_algorithm,time_interval) %>%
  summarise(IQR = IQR(reproduction_ratio))

# Figure 2

for (index in 2:length(slices)-1){
  min = slices[index]
  max = slices[index+1]
  
  tempDf <- df %>% 
    mutate(reproduced_on_time = ifelse(time_spent < max, 1,0)) %>%
    group_by(application, case, exception_name, frame_level, search_algorithm) %>%
    summarise(count = sum(reproduced_on_time))
  
  tempDf$reproduced_in_majority <- ifelse(tempDf$count>=15,1,0)
  tempDf$reproduced_majority_name <- ifelse(tempDf$count>=15,tempDf$search_algorithm,"")
  
  tempDf <- tempDf %>%
    inner_join(tempDf, by = c("application","case","frame_level","exception_name"), suffix = c('.alg1', '.alg2')) %>%
    filter(search_algorithm.alg1 != search_algorithm.alg2 & search_algorithm.alg1 == WINNER_MOHO) %>%
    group_by(application,case,frame_level,exception_name) %>%
    summarise(reproduced_by_MOHO = max(reproduced_in_majority.alg1), reproduced_by_baseline = paste0(reproduced_majority_name.alg2, collapse = " "), reproduced_by_baseline_count = sum(reproduced_in_majority.alg2))
  
  tempDf <- tempDf %>%
    filter(reproduced_by_MOHO + reproduced_by_baseline_count > 0) %>%
    mutate(time_budget = max)
  
  if (index == 1){
    finalDF<-data.frame(tempDf)
  }else{
    finalDF<-bind_rows(finalDF, tempDf)
  }
  
}

counts <- data.frame('time'=NA, 'count'=NA, 'type'=NA, 'MOHO reproduces'=NA)
counts <- counts[0,]

for (index in 2:length(slices)-1){
  time_slice = slices[index+1]
  
  mbs <- finalDF %>%
    filter(time_budget == time_slice & reproduced_by_MOHO == 1 & reproduced_by_baseline_count < 2) %>%
    filter(reproduced_by_baseline_count == 0 | !grepl("Single", reproduced_by_baseline, fixed=TRUE))
  counts[nrow(counts) + 1,] = c(time_slice,nrow(mbs),'MOHO_better_than_Single','more')
  mbd <- finalDF %>%
    filter(time_budget == time_slice & reproduced_by_MOHO == 1 & reproduced_by_baseline_count < 2) %>%
    filter(reproduced_by_baseline_count == 0 | !grepl("De-MO", reproduced_by_baseline, fixed=TRUE))
  counts[nrow(counts) + 1,] = c(time_slice,nrow(mbd),'MOHO_better_than_DEMO','more')
  
  sbm <- finalDF %>%
    filter(time_budget == time_slice & reproduced_by_MOHO == 0 & reproduced_by_baseline_count > 0) %>%
    filter(grepl("Single", reproduced_by_baseline, fixed=TRUE))
  counts[nrow(counts) + 1,] = c(time_slice,nrow(sbm),'Single_better_than_MOHO','less')
  dbm <- finalDF %>%
    filter(time_budget == time_slice & reproduced_by_MOHO == 0 & reproduced_by_baseline_count > 0) %>%
    filter(grepl("De-MO", reproduced_by_baseline, fixed=TRUE))
  counts[nrow(counts) + 1,] = c(time_slice,nrow(dbm),'DEMO_better_than_MOHO','less')
  
  

  
}
  
counts$time <- factor(counts$time,levels = c(60,120,180,240,300))

counts <- counts %>%
  mutate(than=ifelse(grepl("Single", type, fixed=TRUE),"Single objective","De-MO"))

p <- ggplot(counts, aes(x=time, y=count, group=type)) +
  geom_line(aes(color=MOHO.reproduces))+
  scale_color_manual(values = c("red","blue")) +
  geom_point(aes(shape=than,color=MOHO.reproduces), size=5) +
  scale_shape(solid = FALSE) +
  scale_fill_discrete(name = c("MO-HO reproduces", "than")) +
  labs(x = "Time budget (seconds)", y = "# of crashes") +
  theme(legend.position="top")


ggsave("../figures/rq2-reproduced-crashes.pdf", width = 7, height = 3)

