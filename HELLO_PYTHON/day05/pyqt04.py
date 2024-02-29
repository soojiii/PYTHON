import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow

form_class = uic.loadUiType("pyqt04.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        
    def myclick(self):
        dan = self.le.text()
        idan = int(dan)
        
        txt = ""
        txt += "{}*{}={}\n".format(dan,1,1*idan)
        txt += "{}*{}={}\n".format(dan,2,2*idan)
        txt += "{}*{}={}\n".format(dan,3,3*idan)
        txt += "{}*{}={}\n".format(dan,4,4*idan)
        txt += "{}*{}={}\n".format(dan,5,5*idan)
        txt += "{}*{}={}\n".format(dan,6,6*idan)
        txt += "{}*{}={}\n".format(dan,7,7*idan)
        txt += "{}*{}={}\n".format(dan,8,8*idan)
        txt += "{}*{}={}\n".format(dan,9,9*idan)
        
        self.te.setText(txt)
    
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec()

