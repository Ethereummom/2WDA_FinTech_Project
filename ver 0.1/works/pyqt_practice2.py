<<<<<<< Updated upstream
import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic

form_class = uic.loadUiType("window.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pushButton.clicked.connect(self.inquiry)

    def inquiry(self):
        print("조회 버튼 클릭")

app = QApplication(sys.argv)
window = MyWindow()
window.show()
=======
import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic

form_class = uic.loadUiType("window.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pushButton.clicked.connect(self.inquiry)

    def inquiry(self):
        print("조회 버튼 클릭")

app = QApplication(sys.argv)
window = MyWindow()
window.show()
>>>>>>> Stashed changes
app.exec_()