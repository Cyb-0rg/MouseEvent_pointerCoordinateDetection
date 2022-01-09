from tkinter import *
from tkinter import  messagebox

root = Tk()
root.title("Mouse Pointer Coordinates Detection")
root.geometry("550x550")

frame = Frame (root)


def eventListner_coordinates(event):
    coordinates= "("+str(event.x) + ","+ str(event.y)+")"

    label1.configure(text=coordinates)
    print(coordinates)
     

 

label1  = Label(root)
label1.place (relx= 0.5, rely= 0.5, anchor= CENTER)
 

#root.bind("<Button-1>", eventListner_leftClick)
root.bind("<Motion>", eventListner_coordinates)
root.mainloop()
