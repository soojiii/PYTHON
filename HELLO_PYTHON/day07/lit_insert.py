import sqlite3

con = sqlite3.connect("sample.db")

cur = con.cursor()
colo1 = 3
colo2 = 3
colo3 = 3

sql = f"""
        insert into sample
        (colo1, colo2, colo3) 
        values 
        ('{colo1}','{colo2}','{colo3}')
      """

cur.execute(sql) 
print(cur.rowcount)

con.commit()

cur.close()
con.close()


#--방법1--------------------------------------------------------------

# con = sqlite3.connect("sample.db")
# cur = con.cursor() 
#
# sql = 'insert into sample(colo1, colo2, colo3) values (4,4,4)'
# cur.execute(sql)
# print(cur.rowcount)
#
# con.commit()
#
# cur.close()
# con.close()

#--방법2--------------------------------------------------------------

# con = sqlite3.connect("sample.db")
# cur = con.cursor()
# sql = "insert into sample(colo1, colo2, colo3) values (5,5,5)"
# cur.execute(sql)   
# print(cur.rowcount)
#
# con.commit()
#
# cur.close()
# con.close()

#--방법3--------------------------------------------------------------

# con = sqlite3.connect("sample.db")
# cur = con.cursor()
# sql = """
#         insert into sample
#         (colo1, colo2, colo3) 
#         values 
#         (:1,:2,:3)
#       """
# cur.execute(sql,('6','6','6'))    
# print(cur.rowcount)
# con.commit()
#
# cur.close()
# con.close()