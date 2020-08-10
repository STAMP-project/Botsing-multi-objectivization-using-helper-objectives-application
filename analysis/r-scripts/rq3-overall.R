library(ggplot2)

source('dataclean.r')


allResultsForTime <- getResultsForTime() %>%
  filter(search_algorithm %in% c("De-MO", "Single", WINNER_MOHO)) 

allResultsForTime$search_algorithm <- ifelse(allResultsForTime$search_algorithm == "NSGA_II","NSGA-II",allResultsForTime$search_algorithm)
allResultsForTime$search_algorithm <- ifelse(allResultsForTime$search_algorithm == "PESA_II","PESA-II",allResultsForTime$search_algorithm)
allResultsForTime$search_algorithm <- ifelse(allResultsForTime$search_algorithm == "MOEAD","MOEA/D",allResultsForTime$search_algorithm)


TimeSummary <- allResultsForTime %>%
  group_by(search_algorithm) %>%
  summarise(avg = mean(time_spent), med = median(time_spent))

show(TimeSummary)

allResultsForTime$search_algorithm <- ifelse(allResultsForTime$search_algorithm == WINNER_MOHO,"MO-HO",allResultsForTime$search_algorithm)

ggplot(allResultsForTime, aes(x = search_algorithm, y = time_spent)) +
  theme(text = element_text(size=15),axis.text.x = element_text(size=11)) +
  geom_boxplot() +
  stat_summary(fun.y=mean,pch=22, size = 3, geom='point') +
  ylab("Comsumed Time (seconds)") + xlab("Algorithms")

ggsave("../figures/rq3-time-overall.pdf", width = 7, height = 3)
