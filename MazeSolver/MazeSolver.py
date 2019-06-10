# MazeSolver.py
# Nicole Kulakowski
# April 10, 2018
import sys
import time
import curses


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
        #time.sleep(0.05)
    print ("\n")

def player():
    coolPrint("Use the arrow keys to navigate your way through the maze.")
    coolPrint("Ready Player One? GO!")
    stdscr = curses.initscr()
    curses.cbreak()
    stdscr.keypad(1)
    try:
        while True:
            time.sleep(.1)
            key = cv2.waitKey(10) & 0xFF
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
    except KeyboardInterrupt:
        curses.nocbreak()
        stdscr.keypad(0)
        curses.echo()            


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
