import sqlite3

#--방법1--------------------------------------------------------------
# con = sqlite3.connect("sample.db")
# cur = con.cursor()
#
# sql = "delete from sample where colo1=:1"
# cur.execute(sql,("4"))
# print(cur.rowcount)
#
# con.commit()
#
# cur.close()
# con.close()


#--방법2--------------------------------------------------------------
colo1 = '5'

con = sqlite3.connect("sample.db")
cur = con.cursor()

sql = f"""     
        delete from sample 
        where 
            colo1='{colo1}'
      """
cur.execute(sql)    
print(cur.rowcount)
con.commit()

cur.close()
con.close()