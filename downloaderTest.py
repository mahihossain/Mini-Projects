#!/usr/bin/python3

import sys,requests,os
from tkinter import *

def downloadButton():
    url = Ourl.get()
    size = Osize.get()
    res = requests.get(url)
    downloadFile = open(str(os.path.basename(url)), 'wb')
    for chunk in res.iter_content(int(size)):
        downloadFile.write(chunk)
    downloadFile.close()


mGui = Tk()
Ourl = StringVar()
Osize = StringVar()

mGui.geometry('450x450+500+300')
mGui.title('Noob downloader')

mlabel = Label(mGui, text='In the firstbox put url in second size').pack()

mbutton = Button(mGui, text='Download', command = downloadButton, fg='green', bg='red').pack()

mEntry = Entry(mGui, textvariable=Ourl).pack()

mEntry2 = Entry(mGui, textvariable=Osize).pack()
