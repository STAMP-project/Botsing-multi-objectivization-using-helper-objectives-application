source('dataclean.r')
source('applyfriedmantest.R')


# For crash reproduction

df <- getReproductionRate() %>%
  filter(search_algorithm != "Single" & search_algorithm != "De-MO")

con <- apply_conover(df,df$reproduction_rate,df$search_algorithm,df$case,"Reproduction ratio")
ranking <- apply_friedman_test(df,df$reproduction_rate,df$search_algorithm,df$case,"Reproduction ratio")


print(con)

print(ranking)

