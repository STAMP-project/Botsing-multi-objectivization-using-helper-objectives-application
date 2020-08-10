library(ggplot2)
library(tidyr)

source('dataclean.r')


resultsForReproductionCount <- getReproductionRate() %>%
  mutate(reproduction_perc=(count/30))


internalReproductionCount <- resultsForReproductionCount %>% filter(! search_algorithm %in% c("De-MO", "Single"))

ggplot(internalReproductionCount, aes(x = search_algorithm, y = reproduction_perc)) +
  theme(text = element_text(size=15),axis.text.x = element_text(size=11)) +
  geom_boxplot() +
  stat_summary(fun.y=mean,pch=22, size = 3, geom='point') +
  ylab("Reproduction Ratio (percent)") + xlab("Algorithms")

ggsave("../figures/rq1-reproduction-overall.pdf", width = 7, height = 3.5)
