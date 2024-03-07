from flask import Flask
from flask.globals import request
from flask.templating import render_template
from day10.dao_mem import DaoMem

app = Flask(__name__)

@app.route("/")
@app.route("/mem_list")
def mem_list():
    de = DaoMem()
    list = de.selectList()
    return render_template('mem_list.html', list=list)


@app.route("/mem_detail")
def mem_detail():
    m_id = request.args.get('m_id')
    de = DaoMem()
    vo = de.selectOne(m_id)
    return render_template('mem_detail.html', vo=vo)


@app.route("/mem_add")
def mem_add():
    return render_template('mem_add.html')

@app.route("/mem_add_act",  methods=["POST"])
def mem_add_act():
    m_id = request.form['m_id']
    m_name = request.form['m_name']
    tel = request.form['tel']
    email = request.form['email']
    de = DaoMem()
    cnt = de.insert(m_id, m_name, tel, email)
    return render_template('mem_add_act.html', cnt=cnt)


@app.route("/mem_mod")
def mem_mod():
    m_id = request.args.get('m_id')
    de = DaoMem()
    vo = de.selectOne(m_id)
    return render_template('mem_mod.html', vo=vo)

@app.route("/mem_mod_act", methods=["POST"])
def mem_mod_act():
    m_id = request.form['m_id']
    m_name = request.form['m_name']
    tel = request.form['tel']
    email = request.form['email']
    de = DaoMem()
    cnt = de.update(m_id, m_name, tel, email)
    return render_template('mem_mod_act.html', cnt=cnt)


@app.route("/mem_del_act", methods=["POST"])
def mem_del_act():
    m_id = request.form['m_id']
    de = DaoMem()
    cnt = de.delete(m_id)
    return render_template('mem_del_act.html', cnt=cnt)


if __name__ == "__main__":
    app.run(host="0.0.0.0", debug=True)
    