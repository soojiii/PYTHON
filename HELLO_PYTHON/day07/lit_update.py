import sqlite3

#--방법1--------------------------------------------------------------
# con = sqlite3.connect("sample.db")
# cur = con.cursor()
# sql = "update sample set colo2 =:1, colo3 =:3 where colo1 =6"
# cur.execute(sql,('1','1'))
#
# print(cur.rowcount)
#
# con.commit()
#
# cur.close()
# con.close()


#--방법2--------------------------------------------------------------
# con = sqlite3.connect("sample.db")
# cur = con.cursor()
# sql = """
#         update sample
#         set
#             colo2 =:1, 
#             colo3 =:2 
#         where 
#             colo1 =:3
#       """
# cur.execute(sql,('2','2','6'))    
# print(cur.rowcount)
# con.commit()
#
# cur.close()
# con.close()


#--방법3--------------------------------------------------------------
colo1 = 6
colo2 = 1
colo3 = 1

con = sqlite3.connect("sample.db")
cur = con.cursor()
sql = f"""     
        update sample
        set
            colo2 ='{colo2}',
            colo3 ='{colo3}'
        where 
            colo1 ='{colo1}'
    """
cur.execute(sql)    
print(cur.rowcount)
con.commit()

cur.close()
con.close()