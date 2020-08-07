from data import CaseData,OtherData,ProjectData
from os import path
from re import sub
import csv
from sys import argv

casesObject = CaseData()
data = OtherData()

csvFileDir = content=argv[1]
data.setObjective([argv[2]])
data.setRepeat(argv[3])
data.setAlgorithm([argv[4]])


cases = casesObject.cases
csvFile = open(csvFileDir,"wb")
writer = csv.writer(csvFile)
fieldnames = ['execution_idx', 'application', 'case', 'version', 'classpath', 'package',
              'stacktrace_path', 'fixed', 'fixed_version', 'buggy_frame',
              'p_functional_mocking', 'functional_mocking_percent',
              'p_reflection_on_private','reflection_start_percent',
              'search_budget','population','p_object_pool','p_model_pool_target_init', 'p_model_pool_non_target_init','seed_clone','seed_mutations', 'test_dir', 'search_algorithm', 'objectives']
writer.writerow(fieldnames)
for sc in data.seed_clone:
    for index,case in enumerate(cases):

        project = ProjectData().findProject(case["project"])
        for i in range(0,int(data.repeat)):
            for prob in data.p_functional_mocking:
                for percent in data.functional_mocking_percent:
                    for time in data.search_budget:
                        for pop in data.population:
                            for sm in data.seed_mutations:
                                for pobj in data.p_object_pool:
                                    for pmodel in data.p_model_pool_init:
                                        for search_algorithm in data.search_algorithm:
                                            for objectives in data.objectives:
                                                classpath = path.join("becnhmark","applications",project["name"].upper()+"-bins",project["name"].upper()+"-"+case["version"])
                                                stacktracePath = path.join("becnhmark","crashes",project["name"].upper(),case["name"],case["name"]+".log")
                                                testDir = path.join("JarFiles","GGA-tests",case["name"])
                                                row = []
                                                row.append(i+1)
                                                row.append(project["name"])
                                                row.append(case["name"])
                                                row.append(case["version"])
                                                row.append(classpath)
                                                row.append(project["package"])
                                                row.append(stacktracePath)
                                                row.append("yes" if case["fixed"]=="1" else "no")
                                                row.append(case["fixed_version"])
                                                row.append(sub("[^0-9]", "",case["buggy_frame"]))
                                                row.append(prob)
                                                row.append(percent)
                                                row.append(0)
                                                row.append(0)
                                                row.append(time)
                                                row.append(pop)
                                                row.append(pobj)
                                                row.append(pmodel[0])
                                                row.append(pmodel[1])
                                                row.append(sc)
                                                row.append(sm)
                                                row.append(testDir)
                                                row.append(search_algorithm)
                                                row.append(objectives)
                                                writer.writerow(row)
                                        

csvFile.close()

