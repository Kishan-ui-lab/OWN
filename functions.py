'''
Created on Aug 19, 2021

@author: kishankumar
'''
x="sriram"
#print(x)
def somefunction():
    global x
    x="hanuman"
    print(x)
    
somefunction()
print(x)

del x
print(x)

def kisha(**kum):
    print(kum)
    print(kum.keys())
    print(kum.values())
    
    
    
#function calling
#kisha(e=22,f=34,g=35)