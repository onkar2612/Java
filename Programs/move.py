import os
import shutil

tar='C:\\Users\\onkar\\Desktop\\java\\Programs'
des='C:\\Users\\onkar\\Desktop\\java\\Recurrsion_programs'
for i in os.listdir(tar):
    if('Recurrsion' in i):
        shutil.move(i,des)