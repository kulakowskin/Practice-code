# MazeSolver.py
# Nicole Kulakowski
# April 10, 2018
import sys
import time
import cv2


f = open("maze1.txt","r")
f = f.read()
print (f)

f = f.split("\n")
h = len(f)
w = len(f[0])
print ("h x w = " + str(h) +" x "+ str(w))
x = 0
y = 0

def coolPrint(text):
    for char in text:
        sys.stdout.write(char)
        sys.stdout.flush()
        time.sleep(0.05)
    print ("\n")

def player():
    coolPrint("Use the arrow keys to navigate your way through the maze.")
    coolPrint("Ready Player One? GO!")
    while True:
        cv2.waitKey(1) & 0xFF
        if key == 0:
            print ("up")
        elif key == 1:
            print ("down")
        elif key == 2:
            print ("left")
        elif key == 3:
            print ("right")
            # 255 is what the console returns when there is no key press...
        elif key != 255:
            print(key)


def robot():
    return


while True:
    usr = raw_input("Would you like to solve the puzzle or have a robot solve it? (me/robot)\n>>  ")

    if usr == "me":
        coolPrint("Let's DO THIS")
        player()
        exit
    elif usr == "robot":
        coolPrint( "Ok, Nicole's genius AI will do it since you're incapable.")
        robot()
        exit
    else:
        coolPrint( "Um I didn't quite catch that... How about you try again?")
