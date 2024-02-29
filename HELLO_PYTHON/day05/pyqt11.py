import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow

form_class = uic.loadUiType("pyqt11.ui")[0]


class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        
        
    def myclick(self):
        f = self.le_first.text()
        l = self.le_last.text()
        
        ff = int(f)
        ll = int(l)

        txt = ""
        
        for i in range(ff, ll+1):
            txt += self.getStar(i)
        
        self.pte.setPlainText(txt)
        
        
    def getStar(self, cnt):
        # pass <-처음에 오류 안나게 해주면 좋음
        ret = ""
        for i in range(cnt):
            ret += "*"
        ret += "\n"
        return ret
    

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec()

