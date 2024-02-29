import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random

form_class = uic.loadUiType("pyqt09.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.le_mine.returnPressed.connect(self.myclick)
        
    def myclick(self):
        my=""
        com=""
        result=""
        
        my = self.le_mine.text()
        
        ran = random()
        if ran>0.66:
            com = "가위"
        elif ran>0.33:
            com = "바위"
        else:
            com = "보"
        
        if my=="가위" and com=="보":   result = "이김"
        if my=="바위" and com=="가위":    result = "이김"
        if my=="보" and com=="바위":    result = "이김" 
        
        if my=="가위" and com=="바위":    result = "짐" 
        if my=="바위" and com=="보":    result = "짐"
        if my=="보" and com=="가위":    result = "짐" 
        
        if my==com:   result = "비김" 
        
        self.le_com.setText(com)
        self.le_result.setText(result)
        
        
        
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec()

