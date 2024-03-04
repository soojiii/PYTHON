import cx_Oracle

conn = cx_Oracle.connect('python/py@localhost:1521/xe')

cur = conn.cursor() 

cur.execute("select * from emp")

rows = cur.fetchall()
print(rows)
    
cur.close()    
conn.close()