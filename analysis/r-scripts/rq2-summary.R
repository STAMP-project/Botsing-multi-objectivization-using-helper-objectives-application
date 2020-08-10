library("tidyr")

source('dataclean.r')





slices <- c(0,60,120,180,240,300)


df <- getExternalTimeResults()


for (index in 2:length(slices)-1){
  min = slices[index]
  max = slices[index+1]
  
  tempDf <- df %>% 
    filter(search_algorithm %in% c("De-MO", "Single", WINNER_MOHO)) %>%
    mutate(reproduced_on_time = ifelse(time_spent < max, 1,0)) %>%
    group_by(application, case, exception_name, frame_level, search_algorithm) %>%
    summarise(count = sum(reproduced_on_time), reproduction_ratio = sum(reproduced_on_time)/30) %>%
    mutate(time_interval = paste(max,"seconds budget")) %>%
    rename(highest_frame = frame_level)
  tempDf$count <- NULL
  if (index == 1){
    reproduction<-data.frame(tempDf)
  }else{
    reproduction<-bind_rows(reproduction, tempDf)
  }
}

reproduction <- reproduction %>%
  pivot_wider(names_from = c(search_algorithm,time_interval), values_from = reproduction_ratio, names_prefix="reproduction_rate.")

time <- getExternalTimeResults() %>% 
  group_by(application,case,frame_level,exception_name,search_algorithm) %>%
  summarise(avg_time=mean(time_spent)) %>%
  rename(highest_frame = frame_level)

time <- time %>%
  pivot_wider(names_from = search_algorithm, values_from = avg_time, names_prefix="avg_time.")

classes_and_methods <- getClassesAndMethods() %>%
  rename(highest_frame = frame_level)

final <- time %>% 
  left_join(reproduction, by = c("application","case","highest_frame","exception_name"))


final <- final %>%
  left_join(classes_and_methods, by = c("case","highest_frame"))


write.csv(final,"../summary.csv")