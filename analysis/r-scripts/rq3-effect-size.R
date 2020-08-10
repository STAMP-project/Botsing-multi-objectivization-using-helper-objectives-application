source('effect-size.r')


VD_MAGNITUDE_LEVELS = c("large","medium","small")

CONSIDERABLE_VD_MAGNITUDES = c("large","medium")
algorithms <- c("Single","De-MO","MO-HO")

timeEffectSize <- getExternalTimeEffectSizes()

timeEffectSize$search_algorithm.alg1 <- ifelse(timeEffectSize$search_algorithm.alg1 == WINNER_MOHO,"MO-HO",timeEffectSize$search_algorithm.alg1)
timeEffectSize$search_algorithm.alg2 <- ifelse(timeEffectSize$search_algorithm.alg2 == WINNER_MOHO,"MO-HO",timeEffectSize$search_algorithm.alg2)

efficiency_detailed <- data.frame('WinnerAlg.'=NA)


for (sa in algorithms) {
  for (mag in VD_MAGNITUDE_LEVELS) {
    efficiency_detailed[,paste(sa,mag,sep =".")] = NA
  }
}
efficiency_detailed <- efficiency_detailed[0,]

for (sa in algorithms) {
  row =c(sa)
  for (sa2 in algorithms) {
    if(sa == sa2){
      for (mag in VD_MAGNITUDE_LEVELS) {
        row <- c(row,0)
      }
    }else{
      for (mag in VD_MAGNITUDE_LEVELS) {
        tempdf <- timeEffectSize %>%
          filter(search_algorithm.alg1 == sa & search_algorithm.alg2 == sa2 & VD.estimate < 0.5 & VD.magnitude == mag)
        row <- c(row,nrow(tempdf))
      }
    }
  }
  efficiency_detailed[nrow(efficiency_detailed) + 1,] = row
}


print(efficiency_detailed)