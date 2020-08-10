This repository contains the replication package for the study about using new helper objectives (MOHO) for crash reproduction. This study has been accepted at ASE 2020

# ExRunner-bash

Exrunner-bash contains multiple python and bash scripts to evaluate the newly developed features of botsing.

This project contains the following fixed directories:

1- `/bins/` Contains the bytecodes of software under test in JCrashPack.

2- `/crashes/` Contains the stack trace logs in JCrashPack.

3- `/lib/` Contains the botsing-reproduction jar file.

4- `/model-generation/` this directory contains the scripts generating the models for model seeding.

The other directories which start with `crash-reproduction` are for running botsing with different features. Each of these directories contains the input CSV file (`input.csv`), and bash/python scripts needed for running the tool. For instance, `crash-reproduction-model-seeding` is for running botsing model seeding. 

The rational behind having multiple directories is that it makes the experiment easier to be executed on multiple servers. 



For running botsing, first, we need to choose the right directory. Then, we should update the input CSV file (For generating input CSV file use input generator). Finally, we can start botsing execution by running `main.sh`. 

Each `crash-reproduction-*` directory contains two other bash files: `observer.sh` and `parsing.sh`. The former observes the botsing executions and kill them if they get stuck for `X` minutes. The latter parses the valuable information from the execution log and save it in `results/results.csv`.

Botsing's execution logs will be saved in `logs/` directory. Also, the important information about each execution is saved in `results/results.csv`.

Moreover, each `crash-reproduction-*` directory has a `python/` directory. This directory contains small python scripts that utilize the main bash scripts.

# Replication

## Crash Reproduction
**Attention:** The current test suites and CSV files located in this replication package are the ones that are generated during our study. By running more crash reproduction, the generated test cases will be overwritten, and the search process information will be appended to the existing ones in `results.csv` files.

In this study, we run crash reproduction with 7 different configurations:

1- Botsing using `MO-HO` helper objectives and `NSGA-II` MOEA (called `MOHO-NSGA-II` hereafter).

2- Botsing using `MO-HO` helper objectives and `SPEA2` MOEA (called `MOHO-SPEA2` hereafter).

3- Botsing using `MO-HO` helper objectives and `PESA-II` MOEA (called `MOHO-PESA-II` hereafter).

4- Botsing using `MO-HO` helper objectives and `MOEA/D` MOEA (called `MOHO-MOEA/D` hereafter).

5- Botsing using `MO-HO` helper objectives and `FEMO` MOEA (called `MOHO-FEMO` hereafter).

6- Botsing using `DE-MO` helper objectives and `NSGA-II` MOEA (called `DE-MO` hereafter).

7- Botsing using single-objective search process (called `Single` hereafter).


### Run `MOHO-NSGA-II`:

**(I) Prepare Input:**
Run input generator with the following parameters:

```
python input-generator/__init__.py crash-reproduction-moho/inputs.csv WeightedSum:TestLen:CallDiversity <number_of_runs> NSGA_II
```
Since we repeated each execution for 30 times, in our study, we set the `<number_of_runs>` to 30.

This command will update the `input.csv` in `crash-reproduction-moho` directory.

**(II) Run Botsing with Docker:**
Run the following bash file:
```
. docker-run.sh crash-reproduction-moho <number_of_parallel_executions>
```
The generated test cases will store in `crash-reproduction-moho/results/` directory.

The important data about the executions and the search process will be saved in `crash-reproduction-moho/results/results.csv`.


### Run `MOHO-SPEA2`:

**(I) Prepare Input:**
Run input generator with the following parameters:

```
python input-generator/__init__.py crash-reproduction-moho/inputs.csv WeightedSum:TestLen:CallDiversity <number_of_runs> SPEA2
```
Since we repeated each execution for 30 times, in our study, we set the `<number_of_runs>` to 30.

This command will update the `input.csv` in `crash-reproduction-moho` directory.

**(II) Run Botsing with Docker:**
Run the following bash file:
```
. docker-run.sh crash-reproduction-moho <number_of_parallel_executions>
```
The generated test cases will store in `crash-reproduction-moho/results/` directory.

The important data about the executions and the search process will be saved in `crash-reproduction-moho/results/results.csv`.

### Run `MOHO-PESA-II`:

**(I) Prepare Input:**
Run input generator with the following parameters:

```
python input-generator/__init__.py crash-reproduction-moho/inputs.csv WeightedSum:TestLen:CallDiversity <number_of_runs> PESA_II
```
Since we repeated each execution for 30 times, in our study, we set the `<number_of_runs>` to 30.

This command will update the `input.csv` in `crash-reproduction-moho` directory.

**(II) Run Botsing with Docker:**
Run the following bash file:
```
. docker-run.sh crash-reproduction-moho <number_of_parallel_executions>
```
The generated test cases will store in `crash-reproduction-moho/results/` directory.

The important data about the executions and the search process will be saved in `crash-reproduction-moho/results/results.csv`.

### Run `MOHO-MOEA/D`:

**(I) Prepare Input:**
Run input generator with the following parameters:

```
python input-generator/__init__.py crash-reproduction-moho/inputs.csv WeightedSum:TestLen:CallDiversity <number_of_runs> MOEAD
```
Since we repeated each execution for 30 times, in our study, we set the `<number_of_runs>` to 30.

This command will update the `input.csv` in `crash-reproduction-moho` directory.

**(II) Run Botsing with Docker:**
Run the following bash file:
```
. docker-run.sh crash-reproduction-moho <number_of_parallel_executions>
```
The generated test cases will store in `crash-reproduction-moho/results/` directory.

The important data about the executions and the search process will be saved in `crash-reproduction-moho/results/results.csv`.

### Run `MOHO-FEMO`:

**(I) Prepare Input:**
Run input generator with the following parameters:

```
python input-generator/__init__.py crash-reproduction-moho/inputs.csv WeightedSum:TestLen:CallDiversity <number_of_runs> FEMO
```
Since we repeated each execution for 30 times, in our study, we set the `<number_of_runs>` to 30.

This command will update the `input.csv` in `crash-reproduction-moho` directory.

**(II) Run Botsing with Docker:**
Run the following bash file:
```
. docker-run.sh crash-reproduction-moho <number_of_parallel_executions>
```
The generated test cases will store in `crash-reproduction-moho/results/` directory.

The important data about the executions and the search process will be saved in `crash-reproduction-moho/results/results.csv`.

### Run `DE-MO`:

**(I) Prepare Input:**
Run input generator with the following parameters:

```
python input-generator/__init__.py crash-reproduction-moho/inputs.csv WeightedSum:TestLen:CallDiversity <number_of_runs> FEMO
```
Since we repeated each execution for 30 times, in our study, we set the `<number_of_runs>` to 30.

This command will update the `input.csv` in `crash-reproduction-moho` directory.

**(II) Run Botsing with Docker:**
Run the following bash file:
```
. docker-run.sh crash-reproduction-moho <number_of_parallel_executions>
```
The generated test cases will store in `crash-reproduction-moho/results/` directory.

The important data about the executions and the search process will be saved in `crash-reproduction-moho/results/results.csv`.


### Run `Single`:

**(I) Prepare Input:**
Run input generator with the following parameters:

```
python input-generator/__init__.py crash-reproduction-moho/inputs.csv WeightedSum <number_of_runs> Single_Objective_GGA
```
Since we repeated each execution for 30 times, in our study, we set the `<number_of_runs>` to 30.

This command will update the `input.csv` in `crash-reproduction-moho` directory.

**(II) Run Botsing with Docker:**
Run the following bash file:
```
. docker-run.sh crash-reproduction-moho <number_of_parallel_executions>
```
The generated test cases will store in `crash-reproduction-moho/results/` directory.

The important data about the executions and the search process will be saved in `crash-reproduction-moho/results/results.csv`.

## Data Analysis


The raw CSV files used in this analysis is available in `crash-reproduction-moho/results/results.csv` directory.

### RQ1

go to r-scripts directory:

```
cd analysis/r-scripts
```
Run `rq1-internal-assessment.R`:

```
RScript rq1-internal-assessment.R 
```
The results of friedman test will be printed.

To plot the RQ1 figures, run `rq1-plots.R`

```
RScript rq1-plots.R 
```
The output will be stored in `analysis/figures` directory


### RQ2

To plot the RQ2 figures, run `rq2-plots.R`

```
RScript rq2-plots.R 
```

The output will be stored in `analysis/figures` directory


To calculate the summary csv for detecting the corrolation between crash reproductio and exception name + number of frames, run `rq2-summary.R`

```
Rscript rq2-summary.R 
```

The result will be saved as `summary.csv` in the `analysis` directory.


### RQ3

To plot overall efficiency comparison, run `rq3-overall.R`

```
Rscript rq3-overall.R 

```

The output will be stored in `analysis/figures` directory

To calculate the effect sizes run `rq3-effect-size.R`

```
Rscript rq3-effect-size.R 
```

The table will be printed