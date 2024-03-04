import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random
from PyQt5.Qt import QMessageBox

form_class = uic.loadUiType("pyqt12.ui")[0]


class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.com = "213"
        self.setupUi(self)
        
        self.pb.clicked.connect(self.myclick)
        
        self.randomCom()
    
    
    def randomCom(self):
        arr = [1,2,3,4,5,6,7,8,9]
        
        for i in range(1000):
            rnd = int(random()*9)
            a = arr[0]
            arr[0]=arr[rnd]
            arr[rnd]=a
        self.com = "{}{}{}".format(arr[0],arr[1],arr[2])
        
    def myclick(self):
        mine = self.le.text()
        s = self.getStrike(mine, self.com)
        b = self.getBall(mine, self.com)
        
        line = mine + "\t" + str(s) + "S" + str(b) + "B\n"
        str_old = self.te.toPlainText()
        
        self.te.setText(str_old+line)
        self.le.setText("")
        
        if s==3:
            QMessageBox.about(self, '정답입니다.', mine)
    
    
    def geBalle(self, mine, com):
        ret = 0
        m1 = mine[0:1]
        m2 = mine[1:2]
        m3 = mine[2:3]
        
        c1 = com[0:1]
        c2 = com[1:2]
        c3 = com[2:3]
        
        if c1 == m2 or c1 == m3 :   ret += 1
        if c2 == m1 or c2 == m3 :   ret += 1
        if c3 == m1 or c3 == m2 :   ret += 1
            
        return ret
        
        
    def getStrike(self, mine, com):
        ret = 0
        m1 = mine[0:1]
        m2 = mine[1:2]
        m3 = mine[2:3]
        
        c1 = com[0:1]
        c2 = com[1:2]
        c3 = com[2:3]
        
        if c1 == m1 :   ret += 1
        if c2 == m2 :   ret += 1
        if c3 == m3 :   ret += 1
            
        return ret
    

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec()

