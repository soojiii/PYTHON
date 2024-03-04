import cx_Oracle
#--방법1--------------------------------------------------------------
conn = cx_Oracle.connect('python/py@localhost:1521/xe')

cur = conn.cursor()

sql = "delete from emp where e_id=:1"
cur.execute(sql,('4'))
print(cur.rowcount)

conn.commit()

cur.close()
conn.close()


#--방법2--------------------------------------------------------------
# e_id = '4'
#
# conn = cx_Oracle.connect('python/py@localhost:1521/xe')
# cur = conn.cursor()
#
# sql = f"""     
#         delete from emp 
#         where 
#             e_id='{e_id}'
#       """
# cur.execute(sql)    
# print(cur.rowcount)
# conn.commit()
#
# cur.close()
# conn.close()