# Nicole Kulakowski
# 11/13/2017
# This is a Python script used for counting the number
# of lines in a file. The language must be specified in
# order for the program to skip comments.


from os import walk, path

mypath = '.'
f = []
total_lines = 0

def file_len(mydir,file):
     i = 0
     with open(path.join(mydir,file),"r") as f:
           for i, l in enumerate(f):
                 pass
     return i + 1

for(dirpath, dirnames, filenames) in walk(mypath):
    f.extend(filenames)
    for file in filenames:
        try:
            lines = file_len(dirpath,file)
            print dirpath+"/"+file, lines
            total_lines+=lines
        except IOError:
            print "Error reading file: ", dirpath+"/"+file

print "____________\nTotal Lines: ", total_lines
