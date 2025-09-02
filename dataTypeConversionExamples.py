'''
Created on Aug 19, 2021

@author: kishankumar
'''

print(int(10.5))
print(int(True))
print(int("Kishan"))    # o/p :  value error
print(int("100")+int("200"))    # o/p : is 300
s1="kumar"
s2="hi"
res = s1*2 + s2*3
print(res)         #output : kumarkumarhihihi



print(str(10)+str(20))    # o/p : 1020
print(str(10.5)+str(20.2))     #o/p : 10.520.2
print(str(True)+str(False))    # o/p : TrueFalse

##########################
########indexing concept ##################

name="ratanit"
print(name[3])     #o/p : a
print(name[10])    #output : Index error out of range
print(name[2,4])   # output : ta
print(name[2,5])    #output : tan
print(name[2,10])    #output : tanit  


# In python, it is possible to apply relational operator in string data 
# a=97,b=98, A=65,B=66,C=67
print("kishan" > "kumar")

#
msg = "hi kishan sir"
print("kishan" in msg) # o/p : True
print("kumar" in msg)    # o/p : False

print("kishan" not in msg) # o/p : False
print("kumar" not in msg)  # o/p : True

###########################################################
# strip function removes space/character from both sides
name="   kishan   "
print(name)             # o/p:   kishan   
print(name.strip())     # o/p:kishan

print(len(name.strip()))  # o/p : 5

message = "@@@kumar####"
print(message.strip("@#"))   #o/p:kumar

message = "@@@kumar"
print(message.lstrip("@"))   #o/p:kumar

message = "kumar###"
print(message.rstrip("#"))   #o/p:kumar

#### index , rindex, find, rfind
