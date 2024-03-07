import cx_Oracle

class DaoMem:
    def __init__(self):
        self.con = cx_Oracle.connect('python/py@localhost:1521/xe')
        self.cur = self.con.cursor() 
        
        
    def selectList(self):
        self.cur.execute("select m_id, m_name, tel, email from mem")
        
        rows = self.cur.fetchall()
        list = []
        for i in rows:
            list.append({'m_id':i[0], 'm_name':i[1], 'tel':i[2], 'email':i[3]})
        return list
    
    
    def selectOne(self, m_id):
        sql = f"""
            select 
                m_id, m_name, tel, email
            from
                mem
            where 
                m_id = '{m_id}'
        """
        self.cur.execute(sql)
        vo = self.cur.fetchone()
        return {'m_id':vo[0], 'm_name':vo[1], 'tel':vo[2], 'email':vo[3]}
    
    
    def insert(self, m_id, m_name, tel, email):
        sql = f"""
            insert into mem
                (m_id, m_name, tel, email)
            values
                ('{m_id}','{m_name}','{tel}','{email}')
        """
        self.cur.execute(sql)
        self.con.commit()
        
        return self.cur.rowcount
    
    
    def update(self, m_id, m_name, tel, email):
        sql = f"""
            update mem 
            set
                m_name ='{m_name}',
                tel ='{tel}', 
                email ='{email}' 
            where 
                m_id ='{m_id}'
        """
        self.cur.execute(sql)
        self.con.commit()
        
        return self.cur.rowcount
    
    
    def delete(self, m_id):
        sql = f"""
            delete from mem 
            where 
                m_id='{m_id}'
        """
        
        self.cur.execute(sql)
        self.con.commit()
        
        return self.cur.rowcount
    
    
    def __del__(self):
        self.cur.close()
        self.con.close()    
    
    
if __name__== '__main__':
    de = DaoMem()   