import sys
from PyQt5.QtWidgets import *

app = QApplication(sys.argv)
btn = QPushButton("Hello")
btn.show()
app.exec_()