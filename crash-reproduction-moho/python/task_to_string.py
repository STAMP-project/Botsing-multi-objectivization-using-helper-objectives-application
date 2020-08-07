from sys import argv
import json



application=argv[1]
version=argv[2]
case=argv[3]
frame=argv[4]
execution_idx=argv[5]
search_budget=argv[6]
search_algorithm=argv[7]
objectives=argv[8]



data = {'application': application,
        'version': version,
        'case': case,
        'frame': frame,
        'execution_idx': execution_idx,
        'search_budget': search_budget,
        'search_algorithm': search_algorithm,
        'objectives': objectives,
        }


read_json =  json.dumps(data)
print read_json.replace(",", "|")
