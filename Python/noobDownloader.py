#!/usr/bin/python3

import sys,requests,os
from tkinter import *

#Here is the code for the funtion of the GUI button 

def downloadButton():
    url = Ourl.get()
    size = Osize.get()
    res = requests.get(url)
    downloadFile = open(str(os.path.basename(url)), 'wb')
    for chunk in res.iter_content(int(size)):
        downloadFile.write(chunk)
    downloadFile.close()

#Creating a GUI object as mGui
mGui = Tk()

#Creating two StringVar objects for size and url
Ourl = StringVar()
Osize = StringVar()

#Setting up the dimensions of GUI
mGui.geometry('450x450+500+300')

#Giving a title
mGui.title('Noob downloader')

#Label
mlabel = Label(mGui, text='In the firstbox put url in second size').pack()

#Adding functionality in button
mbutton = Button(mGui, text='Download', command = downloadButton, fg='green', bg='red').pack()

#Making the text entry box for url and size
mEntry = Entry(mGui, textvariable=Ourl).pack()

mEntry2 = Entry(mGui, textvariable=Osize).pack()
