import cx_Oracle

conn = cx_Oracle.connect('python/py@localhost:1521/xe')

cur = conn.cursor()
e_id = 4
e_name = 4
gen = 4
addr = 4

sql = f"""
        insert into emp
        (e_id, e_name, gen, addr) 
        values 
        ('{e_id}','{e_name}','{gen}','{addr}')
      """

cur.execute(sql) 
print(cur.rowcount)

conn.commit()

cur.close()
conn.close()


#--방법1--------------------------------------------------------------

# connStr = 'python/py@localhost:1521/xe'
# conn = cx_Oracle.connect(connStr)
# cur = conn.cursor() 
#
# sql = 'insert into emp(e_id, e_name, gen, addr) values (4,4,4,4)'
# cur.execute(sql)
# print(cur.rowcount)

# conn.commit()

# cur.close()
# conn.close()

#--방법2--------------------------------------------------------------

# conn = cx_Oracle.connect('python/py@localhost:1521/xe')
# cur = conn.cursor()
# sql = "insert into emp(e_id, e_name, gen, addr) values (5,5,5,5)"
# cur.execute(sql)   
# print(cur.rowcount)
#
# conn.commit()

# cur.close()
# conn.close()

#--방법3--------------------------------------------------------------

# conn = cx_Oracle.connect('python/py@localhost:1521/xe')
# cur = conn.cursor()
# sql = """
#         insert into emp
#         (e_id, e_name, gen, addr) 
#         values 
#         (:1,:2,:3,:4)
#       """
# cur.execute(sql,('6','6','6','6'))    
# print(cur.rowcount)
# conn.commit()

# cur.close()
# conn.close()