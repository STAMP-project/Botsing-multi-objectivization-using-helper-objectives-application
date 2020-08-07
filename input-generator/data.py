class ProjectData:
    projects=[{"id":"0","name":"xwiki","package":"xwiki"},
                {"id":"1","name":"chart","package":"chart"},
                {"id":"2","name":"lang","package":"lang3"},
                {"id":"3","name":"math","package":"math3"},
                {"id":"4","name":"mockito","package":"mockito"},
                {"id":"5","name":"time","package":"time"},
                {"id":"6","name":"es","package":"elasticsearch"}
              ]
    def findProject(self,id):
        result = {}
        for p in self.projects:
            if p["id"] == id:
                result = p
                break
        return result
class CaseData:
    cases = [

        # 1- 20
        {"id": "39", "project": "2", "name": "LANG-12b", "version": "12b", "fixed": "1", "fixed_version": "12f",
         "buggy_frame": "2"},

        {"id": "60", "project": "2", "name": "LANG-9b", "version": "9b", "fixed": "1", "fixed_version": "9f",
         "buggy_frame": "5"},
        {"id": "61", "project": "3", "name": "MATH-100b", "version": "100b", "fixed": "1", "fixed_version": "100f",
         "buggy_frame": "1"},

        {"id": "81", "project": "3", "name": "MATH-81b", "version": "81b", "fixed": "1", "fixed_version": "81f",
         "buggy_frame": "6"},
        {"id": "89", "project": "3", "name": "MATH-98b", "version": "98b", "fixed": "1", "fixed_version": "98f",
         "buggy_frame": "1"},
        {"id": "97", "project": "4", "name": "MOCKITO-34b", "version": "34b", "fixed": "1", "fixed_version": "34f",
         "buggy_frame": "1"},
        {"id": "100", "project": "4", "name": "MOCKITO-3b", "version": "3b", "fixed": "1", "fixed_version": "3f",
         "buggy_frame": "12"},
        {"id": "68", "project": "3", "name": "MATH-32b", "version": "32b", "fixed": "1", "fixed_version": "32f",
         "buggy_frame": "10"},
        {"id": "84", "project": "3", "name": "MATH-89b", "version": "89b", "fixed": "1", "fixed_version": "89f",
         "buggy_frame": "1"},

        {"id": "91", "project": "4", "name": "MOCKITO-12b", "version": "12b", "fixed": "1", "fixed_version": "12f",
         "buggy_frame": "1"},

        {"id": "37", "project": "1", "name": "CHART-4b", "version": "4b", "fixed": "1", "fixed_version": "4f",
         "buggy_frame": "6"},
        {"id": "47", "project": "2", "name": "LANG-33b", "version": "33b", "fixed": "1", "fixed_version": "33f",
         "buggy_frame": "1"},

        {"id": "98", "project": "4", "name": "MOCKITO-36b", "version": "36b", "fixed": "1", "fixed_version": "36f",
         "buggy_frame": "1"},
        {"id": "80", "project": "3", "name": "MATH-79b", "version": "79b", "fixed": "1", "fixed_version": "79f",
         "buggy_frame": "2"},

        {"id": "78", "project": "3", "name": "MATH-70b", "version": "70b", "fixed": "1", "fixed_version": "70f",
         "buggy_frame": "3"},
        {"id": "123", "project": "0", "name": "XWIKI-14152", "version": "8.4.4", "fixed": "1", "fixed_version": "8.4.5",
         "buggy_frame": "unknown"},
        {"id": "31", "project": "0", "name": "XWIKI-13942", "version": "8.4", "fixed": "1", "fixed_version": "8.4.4",
         "buggy_frame": "unknown"},
        {"id": "7", "project": "0", "name": "XCOMMONS-928", "version": "7.4.2", "fixed": "1", "fixed_version": "7.4.3",
         "buggy_frame": "5"},
        {"id": "16", "project": "0", "name": "XWIKI-12667", "version": "7.2", "fixed": "1",
         "fixed_version": "7.3-milestone-1", "buggy_frame": "not available on stack trace"},
        {"id": "20", "project": "0", "name": "XWIKI-13546", "version": "7.4.2", "fixed": "1", "fixed_version": "7.4.5",
         "buggy_frame": "10"},


        # # 21 - 45
        {"id": "2", "project": "0", "name": "XWIKI-13377", "version": "8.1-milestone-1", "fixed": "1",
         "fixed_version": "8.1-rc-1", "buggy_frame": "5"},

        {"id": "10", "project": "0", "name": "XWIKI-13031", "version": "7.4", "fixed": "1", "fixed_version": "7.4.1",
         "buggy_frame": "2"},

        {"id": "4", "project": "0", "name": "XWIKI-13916", "version": "8.4", "fixed": "1", "fixed_version": "8.4.2",
         "buggy_frame": "1"},
        {"id": "114", "project": "0", "name": "XWIKI-12584", "version": "7.2-milestone-2", "fixed": "1",
         "fixed_version": "7.2", "buggy_frame": "2"},
        {"id": "113", "project": "0", "name": "XWIKI-12482", "version": "7.2-milestone-3", "fixed": "1",
         "fixed_version": "7.2-rc-1", "buggy_frame": "1"},
        {"id": "11", "project": "0", "name": "XWIKI-13096", "version": "7.3", "fixed": "1", "fixed_version": "7.4.2",
         "buggy_frame": "1"},

        {"id": "3", "project": "0", "name": "XWIKI-14475", "version": "9.5", "fixed": "1", "fixed_version": "9.5.1",
         "buggy_frame": "1"},

        {"id": "22", "project": "0", "name": "XWIKI-13303", "version": "8.0", "fixed": "1",
         "fixed_version": "8.1-milestone-2", "buggy_frame": "not available on stack trace"},
        {"id": "13", "project": "0", "name": "XWIKI-14612", "version": "8.4", "fixed": "1", "fixed_version": "9.7-rc-1",
         "buggy_frame": "unknown"},
        {"id": "5", "project": "0", "name": "XWIKI-14554", "version": "9.6-rc-1", "fixed": "1", "fixed_version": "9.7",
         "buggy_frame": "1"},
        {"id": "0", "project": "0", "name": "XWIKI-13708", "version": "8.2.1", "fixed": "1",
         "fixed_version": "8.3-rc-1", "buggy_frame": "1"},
        {"id": "8", "project": "0", "name": "XWIKI-13616", "version": "8.2", "fixed": "1", "fixed_version": "8.2.2",
         "buggy_frame": "5"},
        {"id": "30", "project": "0", "name": "XWIKI-13617", "version": "8.2.1", "fixed": "1",
         "fixed_version": "8.3-milestone-1", "buggy_frame": "3"},
        {"id": "12", "project": "0", "name": "XWIKI-14319", "version": "9.4-rc-1", "fixed": "0", "fixed_version": "",
         "buggy_frame": ""},
        {"id": "24", "project": "0", "name": "XWIKI-13316", "version": "8.0", "fixed": "1",
         "fixed_version": "8.1-milestone-2", "buggy_frame": "not available on stack trace"},
        {"id": "25", "project": "0", "name": "XWIKI-13457", "version": "8.0", "fixed": "1", "fixed_version": "8.2.2",
         "buggy_frame": "7"},

        {"id": "1", "project": "0", "name": "XWIKI-14227", "version": "9.3", "fixed": "1", "fixed_version": "9.3.1",
         "buggy_frame": "3"},

        {"id": "14", "project": "0", "name": "XRENDERING-418", "version": "7.3", "fixed": "0", "fixed_version": "",
         "buggy_frame": ""},
        {"id": "18", "project": "0", "name": "XWIKI-13372", "version": "7.4.2", "fixed": "1", "fixed_version": "7.4.6",
         "buggy_frame": "2"},
        {"id": "17", "project": "0", "name": "XWIKI-13196", "version": "7.4.2", "fixed": "0", "fixed_version": "",
         "buggy_frame": ""},
        {"id": "99", "project": "4", "name": "MOCKITO-38b", "version": "38b", "fixed": "1", "fixed_version": "38f",
         "buggy_frame": "2"},

        {"id": "54", "project": "2", "name": "LANG-47b", "version": "47b", "fixed": "1", "fixed_version": "47f",
         "buggy_frame": "1"},

        {"id": "51", "project": "2", "name": "LANG-39b", "version": "39b", "fixed": "1", "fixed_version": "39f",
         "buggy_frame": "2"},

        {"id": "57", "project": "2", "name": "LANG-57b", "version": "57b", "fixed": "1", "fixed_version": "57f",
         "buggy_frame": "1"},

        {"id": "73", "project": "3", "name": "MATH-4b", "version": "4b", "fixed": "1", "fixed_version": "4f",
         "buggy_frame": "3"},

        # ## Remaining cases:

        # # 46 - 95
        # # 1690
        {"id": "36", "project": "1", "name": "CHART-13b", "version": "13b", "fixed": "1", "fixed_version": "13f",
         "buggy_frame": "6"},
        {"id": "40", "project": "2", "name": "LANG-13b", "version": "13b", "fixed": "1", "fixed_version": "13f",
         "buggy_frame": "13"},

        {"id": "41", "project": "2", "name": "LANG-16b", "version": "16b", "fixed": "1", "fixed_version": "16f",
         "buggy_frame": "1"},

        {"id": "42", "project": "2", "name": "LANG-19b", "version": "19b", "fixed": "1", "fixed_version": "19f",
         "buggy_frame": "4"},

        {"id": "43", "project": "2", "name": "LANG-1b", "version": "1b", "fixed": "1", "fixed_version": "1f",
         "buggy_frame": "6"},
        {"id": "44", "project": "2", "name": "LANG-20b", "version": "20b", "fixed": "1", "fixed_version": "20f",
         "buggy_frame": "3"},

        {"id": "45", "project": "2", "name": "LANG-27b", "version": "27b", "fixed": "1", "fixed_version": "27f",
         "buggy_frame": "3"},

        {"id": "46", "project": "2", "name": "LANG-2b", "version": "2b", "fixed": "1", "fixed_version": "2f",
         "buggy_frame": "1"},
        {"id": "48", "project": "2", "name": "LANG-35b", "version": "35b", "fixed": "1", "fixed_version": "35f",
         "buggy_frame": "2"},
        {"id": "49", "project": "2", "name": "LANG-36b", "version": "36b", "fixed": "1", "fixed_version": "36f",
         "buggy_frame": "1"},
        {"id": "50", "project": "2", "name": "LANG-37b", "version": "37b", "fixed": "1", "fixed_version": "37f",
         "buggy_frame": "2"},
        {"id": "52", "project": "2", "name": "LANG-44b", "version": "44b", "fixed": "1", "fixed_version": "44f",
         "buggy_frame": "2"},
        {"id": "53", "project": "2", "name": "LANG-45b", "version": "45b", "fixed": "1", "fixed_version": "45f",
         "buggy_frame": "2"},

        {"id": "55", "project": "2", "name": "LANG-51b", "version": "51b", "fixed": "1", "fixed_version": "51f",
         "buggy_frame": "2"},

        {"id": "56", "project": "2", "name": "LANG-54b", "version": "54b", "fixed": "1", "fixed_version": "54f",
         "buggy_frame": "1"},
        {"id": "58", "project": "2", "name": "LANG-5b", "version": "5b", "fixed": "1", "fixed_version": "5f",
         "buggy_frame": "1"},

        {"id": "59", "project": "2", "name": "LANG-6b", "version": "6b", "fixed": "1", "fixed_version": "6f",
         "buggy_frame": "5"},

        {"id": "62", "project": "3", "name": "MATH-101b", "version": "101b", "fixed": "1", "fixed_version": "101f",
         "buggy_frame": "2"},
        {"id": "63", "project": "3", "name": "MATH-103b", "version": "103b", "fixed": "1", "fixed_version": "103f",
         "buggy_frame": "3"},
        {"id": "66", "project": "3", "name": "MATH-1b", "version": "1b", "fixed": "1", "fixed_version": "1f",
         "buggy_frame": "2"},

        {"id": "67", "project": "3", "name": "MATH-31b", "version": "31b", "fixed": "1", "fixed_version": "31f",
         "buggy_frame": "8"},
        {"id": "69", "project": "3", "name": "MATH-38b", "version": "38b", "fixed": "1", "fixed_version": "38f",
         "buggy_frame": "6"},

        {"id": "70", "project": "3", "name": "MATH-3b", "version": "3b", "fixed": "1", "fixed_version": "3f",
         "buggy_frame": "1"},

        {"id": "71", "project": "3", "name": "MATH-40b", "version": "40b", "fixed": "1", "fixed_version": "40f",
         "buggy_frame": "5"},

        {"id": "72", "project": "3", "name": "MATH-49b", "version": "49b", "fixed": "1", "fixed_version": "49f",
         "buggy_frame": "4"},

        {"id": "74", "project": "3", "name": "MATH-51b", "version": "51b", "fixed": "1", "fixed_version": "51f",
         "buggy_frame": "7"},

        {"id": "75", "project": "3", "name": "MATH-58b", "version": "58b", "fixed": "1", "fixed_version": "58f",
         "buggy_frame": "12"},

        {"id": "76", "project": "3", "name": "MATH-60b", "version": "60b", "fixed": "1", "fixed_version": "60f",
         "buggy_frame": "5"},

        {"id": "77", "project": "3", "name": "MATH-61b", "version": "61b", "fixed": "1", "fixed_version": "61f",
         "buggy_frame": "3"},

        {"id": "79", "project": "3", "name": "MATH-78b", "version": "78b", "fixed": "1", "fixed_version": "78f",
         "buggy_frame": "3"},

        {"id": "82", "project": "3", "name": "MATH-84b", "version": "84b", "fixed": "1", "fixed_version": "84f",
         "buggy_frame": "3"},
        {"id": "83", "project": "3", "name": "MATH-85b", "version": "85b", "fixed": "1", "fixed_version": "85f",
         "buggy_frame": "3"},
        {"id": "85", "project": "3", "name": "MATH-8b", "version": "8b", "fixed": "1", "fixed_version": "8f",
         "buggy_frame": "1"},
        {"id": "86", "project": "3", "name": "MATH-90b", "version": "90b", "fixed": "1", "fixed_version": "90f",
         "buggy_frame": "1"},
        {"id": "87", "project": "3", "name": "MATH-95b", "version": "95b", "fixed": "1", "fixed_version": "95f",
         "buggy_frame": "4"},
        {"id": "88", "project": "3", "name": "MATH-97b", "version": "97b", "fixed": "1", "fixed_version": "97f",
         "buggy_frame": "1"},
        {"id": "90", "project": "4", "name": "MOCKITO-10b", "version": "10b", "fixed": "1", "fixed_version": "10f",
         "buggy_frame": "19"},
        {"id": "92", "project": "4", "name": "MOCKITO-16b", "version": "16b", "fixed": "1", "fixed_version": "16f",
         "buggy_frame": "11"},
        {"id": "93", "project": "4", "name": "MOCKITO-17b", "version": "17b", "fixed": "1", "fixed_version": "17f",
         "buggy_frame": "4"},
        {"id": "94", "project": "4", "name": "MOCKITO-1b", "version": "1b", "fixed": "1", "fixed_version": "1f",
         "buggy_frame": "10"},
        {"id": "95", "project": "4", "name": "MOCKITO-21b", "version": "21b", "fixed": "1", "fixed_version": "21f",
         "buggy_frame": "4"},
        {"id": "96", "project": "4", "name": "MOCKITO-23b", "version": "23b", "fixed": "1", "fixed_version": "23f",
         "buggy_frame": "53"},

        {"id": "101", "project": "4", "name": "MOCKITO-4b", "version": "4b", "fixed": "1", "fixed_version": "4f",
         "buggy_frame": "4"},

        {"id": "102", "project": "4", "name": "MOCKITO-7b", "version": "7b", "fixed": "1", "fixed_version": "7f",
         "buggy_frame": "8"},
        {"id": "104", "project": "4", "name": "MOCKITO-9b", "version": "9b", "fixed": "1", "fixed_version": "9f",
         "buggy_frame": "11"},

        {"id": "105", "project": "5", "name": "TIME-10b", "version": "10b", "fixed": "1", "fixed_version": "10f",
         "buggy_frame": "5"},

        {"id": "106", "project": "5", "name": "TIME-14b", "version": "14b", "fixed": "1", "fixed_version": "14f",
         "buggy_frame": "5"},

        {"id": "107", "project": "5", "name": "TIME-18b", "version": "18b", "fixed": "1", "fixed_version": "18f",
         "buggy_frame": "5"},

        {"id": "108", "project": "5", "name": "TIME-20b", "version": "20b", "fixed": "1", "fixed_version": "20f",
         "buggy_frame": "1"},
        {"id": "109", "project": "5", "name": "TIME-2b", "version": "2b", "fixed": "1", "fixed_version": "2f",
         "buggy_frame": "2"},

        # # 4310
        # # 96 - 124

        {"id": "6", "project": "0", "name": "XCOMMONS-1057", "version": "8.2.1", "fixed": "1", "fixed_version": "8.2.2",
         "buggy_frame": "1"},
        {"id": "9", "project": "0", "name": "XRENDERING-481", "version": "9.6", "fixed": "1", "fixed_version": "9.7",
         "buggy_frame": "1"},
        {"id": "15", "project": "0", "name": "XRENDERING-422", "version": "7.3", "fixed": "0", "fixed_version": "",
         "buggy_frame": ""},
        {"id": "19", "project": "0", "name": "XWIKI-13396", "version": "7.4.2", "fixed": "0", "fixed_version": "",
         "buggy_frame": ""},
        {"id": "21", "project": "0", "name": "XWIKI-12798", "version": "7.3-rc-1", "fixed": "1", "fixed_version": "7.3",
         "buggy_frame": "1"},
        {"id": "23", "project": "0", "name": "XWIKI-12889", "version": "7.4-milestone-1", "fixed": "1",
         "fixed_version": "7.4-milestone-2", "buggy_frame": "2"},

        {"id": "26", "project": "0", "name": "XWIKI-13544", "version": "7.4.4", "fixed": "1", "fixed_version": "7.4.5",
         "buggy_frame": "unknown"},

        {"id": "27", "project": "0", "name": "XWIKI-13345", "version": "8.1-milestone-1", "fixed": "1",
         "fixed_version": "8.1-milestone-2", "buggy_frame": "1"},
        {"id": "28", "project": "0", "name": "XWIKI-13407", "version": "8.1-rc-1", "fixed": "1",
         "fixed_version": "8.2-milestone-2", "buggy_frame": "5"},

        {"id": "29", "project": "0", "name": "XWIKI-8281", "version": "8.2", "fixed": "0", "fixed_version": "",
         "buggy_frame": ""},

        {"id": "32", "project": "0", "name": "XWIKI-14263", "version": "8.4", "fixed": "1", "fixed_version": "9.4-rc-1",
         "buggy_frame": "1"},
        {"id": "33", "project": "0", "name": "XWIKI-14462", "version": "9.5", "fixed": "1", "fixed_version": "9.6-rc-1",
         "buggy_frame": "unknown"},
        {"id": "34", "project": "0", "name": "XWIKI-14599", "version": "9.6", "fixed": "1", "fixed_version": "9.8-rc-1",
         "buggy_frame": "unknown"},
        {"id": "35", "project": "0", "name": "XWIKI-13193", "version": "7.4.2", "fixed": "1", "fixed_version": "7.4.4",
         "buggy_frame": "1"},
        {"id": "115", "project": "0", "name": "XWIKI-12855", "version": "7.3", "fixed": "1",
         "fixed_version": "7.4-milestone-1", "buggy_frame": "unknown"},
        {"id": "116", "project": "0", "name": "XWIKI-12896", "version": "7.3", "fixed": "1",
         "fixed_version": "7.4-milestone-2", "buggy_frame": "unknown"},
        {"id": "117", "project": "0", "name": "XWIKI-12919", "version": "7.4-milestone-2", "fixed": "1",
         "fixed_version": "7.4-rc-1", "buggy_frame": "unknown"},
        {"id": "118", "project": "0", "name": "XWIKI-13137", "version": "7.4.1", "fixed": "0", "fixed_version": "",
         "buggy_frame": "unknown"},
        {"id": "119", "project": "0", "name": "XWIKI-13138", "version": "8.0-milestone-2", "fixed": "0",
         "fixed_version": "", "buggy_frame": "unknown"},

        {"id": "120", "project": "0", "name": "XWIKI-13141", "version": "7.4.2", "fixed": "1",
         "fixed_version": "8.0-rc-1", "buggy_frame": "1"},

        {"id": "121", "project": "0", "name": "XWIKI-13288", "version": "7.4.2", "fixed": "1", "fixed_version": "7.4.3",
         "buggy_frame": "unknown"},
        {"id": "122", "project": "0", "name": "XWIKI-14149", "version": "9.3-rc-1", "fixed": "0", "fixed_version": "",
         "buggy_frame": "unknown"},
        {"id": "160", "project": "0", "name": "XWIKI-14302", "version": "9.4-rc-1", "fixed": "1",
         "fixed_version": "9.4", "buggy_frame": "not available on stack trace"},
        {"id": "161", "project": "0", "name": "XWIKI-14556", "version": "9.5", "fixed": "1", "fixed_version": "9.5.2",
         "buggy_frame": "not available on stack trace"},
        {"id": "162", "project": "0", "name": "XWIKI-14122", "version": "9.2-rc-1", "fixed": "1",
         "fixed_version": "9.2", "buggy_frame": "not available on stack trace"},
        {"id": "163", "project": "0", "name": "XWIKI-14626", "version": "9.3.1", "fixed": "0", "fixed_version": "",
         "buggy_frame": ""},

        {"id": "110", "project": "5", "name": "TIME-5b", "version": "5b", "fixed": "1", "fixed_version": "5f",
         "buggy_frame": "3"},
        {"id": "111", "project": "5", "name": "TIME-7b", "version": "7b", "fixed": "1", "fixed_version": "7f",
         "buggy_frame": "6"},

        {"id": "112", "project": "5", "name": "TIME-8b", "version": "8b", "fixed": "1", "fixed_version": "8f",
         "buggy_frame": "1"},
    ]



class OtherData:
    search_algorithm=["NSGA_II"]
    objectives = ["WeightedSum:TestLen:CallDiversity"]
    p_functional_mocking = [""]
    functional_mocking_percent = [""]
    search_budget = [300]
    population = [50]
    seed_clone=[""]
    seed_mutations=[""]
    p_object_pool=[""]
    p_model_pool_init = [["", ""]]
    repeat = 30


    def setObjective(self,objectives):
        self.objectives = objectives

    def setRepeat(self,repeat):
        self.repeat=repeat

    def setAlgorithm(self,alg):
        self.search_algorithm = alg
