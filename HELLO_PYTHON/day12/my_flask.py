from flask import Flask
from flask.json import jsonify
from flask.globals import request

app = Flask(__name__)

@app.route("/")
def main():
    return "Hello flask!"

@app.route('/ajax', methods=['POST'])
def ajax():
    data = request.get_json()
    print(data['menu'])
    
    return jsonify(result = "success")
    
    
@app.route('/fetch', methods=['POST'])
def fetch():
    menu = request.form['menu']
    print(menu)
    return jsonify(result = "success")


@app.route('/axios', methods=['POST'])
def axios():
    meta = request.get_json()
    print(meta['data'])
    return jsonify(result = "success")

if __name__ == "__main__":
    app.run(host="0.0.0.0", debug=True)
    