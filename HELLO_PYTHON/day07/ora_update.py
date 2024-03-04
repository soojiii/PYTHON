import cx_Oracle

#--방법1--------------------------------------------------------------
# conn = cx_Oracle.connect('python/py@localhost:1521/xe')
# cur = conn.cursor()
# sql = "update emp set e_name =:1, gen =:2, addr =:3 where e_id =4"
# cur.execute(sql,('1','1','1'))
#
# print(cur.rowcount)
#
# conn.commit()
#
# cur.close()
# conn.close()


#--방법2--------------------------------------------------------------
# conn = cx_Oracle.connect('python/py@localhost:1521/xe')
# cur = conn.cursor()
# sql = """
#         update emp
#         set
#             e_name =:1,
#             gen =:2, 
#             addr =:3 
#         where 
#             e_id =:4
#       """
# cur.execute(sql,('2','2','2','4'))    
# print(cur.rowcount)
# conn.commit()
#
# cur.close()
# conn.close()


#--방법3--------------------------------------------------------------
e_id = 4
e_name = 6
gen = 6
addr = 6

conn = cx_Oracle.connect('python/py@localhost:1521/xe')
cur = conn.cursor()
sql = f"""     
        update emp
        set
            e_name ='{e_name}',
            gen ='{gen}', 
            addr ='{addr}' 
        where 
            e_id ='{e_id}'
      """
cur.execute(sql)    
print(cur.rowcount)
conn.commit()

cur.close()
conn.close()