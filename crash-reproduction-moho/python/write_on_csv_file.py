import sys
import fcntl
import csv
import re
import os


## input arguments
execution_idx=sys.argv[1]
application=sys.argv[2]
case=sys.argv[3]
version=sys.argv[4]
frame_level=sys.argv[5]
search_budget=sys.argv[6]
search_algorithm=sys.argv[7]
objectives=sys.argv[8]
dir_path = os.path.dirname(os.path.realpath(__file__))
log_dir = os.path.join(dir_path, "..", "logs",case+"-"+frame_level+"-"+execution_idx+"-"+search_algorithm+"-"+objectives+"-out.txt")
out_dir = os.path.join(dir_path, "..", "results","results.csv")
##




### functions
def write_on_csv_file(csv_result,csv_file_dir):
    title_order = [
                   "execution_idx",
                   "application",
                   "case",
                   "version",
                   "exception_name",
                   "frame_level",
                   "search_budget",
                   "search_algorithm",
                   "objectives",
                   "fitness_function_value",
                   "number_of_fitness_evaluations",
                   "time_spent",
                   "fitness_function_evolution"
                   ]

    fields = []

    for cell in title_order:
        if cell in csv_result.keys():
            fields.append(csv_result[cell])
        else:
            fields.append("")

    with open(csv_file_dir, "a") as  g:
        fcntl.flock(g, fcntl.LOCK_EX)
        writer = csv.writer(g)
        writer.writerow(fields)
        fcntl.flock(g, fcntl.LOCK_UN)
###




csv_result = {"execution_idx": execution_idx,
              "application": application,
              "case": case,
              "version": version,
              "frame_level": frame_level,
              "search_budget": search_budget,
              "fitness_function_value":"-1",
              "fitness_function_evolution":"",
              "number_of_fitness_evaluations":0,
              "time_spent":0,
              "search_algorithm": search_algorithm,
              "objectives": objectives}

with open(log_dir, "r") as ins:
    for stdout_line in ins:
        if "New Value for Weighted Sum after" in stdout_line:
            splitted_line_1 = stdout_line.split(" after ")
            splitted_line_1 = splitted_line_1[1].split(" fitness")
            ffEval=splitted_line_1[0].strip()
            splitted_line_1 = splitted_line_1[1].split(" second: ")
            ffValue=splitted_line_1[1].strip()
            splitted_line_1  = splitted_line_1[0].split(" and ")
            time=splitted_line_1[1].strip()
            csv_result["number_of_fitness_evaluations"] = ffEval
            csv_result["fitness_function_value"] = ffValue
            csv_result["time_spent"] = time
            csv_result["fitness_function_evolution"]+=("["+str(ffValue)+","+str(ffEval)+","+str(time)+"]")
        elif "The target crash is covered" in stdout_line:
            csv_result["fitness_function_value"]="0.0"
        elif "Exception type is detected:" in stdout_line:
            splitted_line_1 = stdout_line.split("Exception type is detected: ")
            csv_result["exception_name"]=splitted_line_1[1].replace('\n', ' ').replace('\r', '').strip()


write_on_csv_file(csv_result,out_dir)
