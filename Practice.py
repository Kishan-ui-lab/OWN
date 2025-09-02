

#index() and find() functions both returns index position of the data.
#when we use index() function , if the lement is not present it will generate valueError.
#when we use find() function , if the lement is not present it will -1.

name="kishan"
print(name.index('s'))    # o/p : 2
print(name.rindex('n'))    # o/p : 5

print(name.find('s'))  # o/p : 2
print(name.rfind('n'))   # o/p : 5

print(name.find('z'))  # o/p : -1
print(name.rfind('z'))   # o/p : -1

print(name.index('z'))  # ValueError: substring not found
print(name.rindex('z'))  # ValueError: substring not found

###################################################################

name = "hi kishan sir, you are, good at, coding"
for x in name.split(","):
    print(x)                

# o/p : hi kishan sir
     #   you are
     #    good at
     # coding
  
# spliting the data using user defined symbol/character   
name1 = "hi kishan sir kishan  great sir kishan bad"
for x in name1.split("kishan"):
    print(x)


# o/p : hi
  #    sir
  #    great  sir
  # bad

#######################################################

#     isalnum() it  will take alphabets,numerics and both

str1 = "python"
print(str1.isalnum())  # o/p :  True

str2 = "122345567"
print(str2.isalnum())  # o/p : True

str3 = "python36"
print(str3.isalnum())  # o/p : True

########################################

#   isalpha()  it will take only alphabets 

str4 = "python"
print(str4.isalpha())  # o/p :  True

str5 = "python36"
print(str5.isalpha())  # o/p :  False

# isdigit() it will take only digits
str6 = "python"
print(str6.isdigit())  # o/p :  False

str7 = "3633636"
print(str7.isdigit())  # o/p :  True
#not always return boolean value 
print(not True) # False
print(not False) # True
print(not 0) #True
print(not 1) #False
print(not "kish") #False
print(not 100) #False
print(not "False") #False

name="kishan"
print("kishan" in name) # True
print("kum" in name) # False
print("kishan" not in name) #False
print("kum" not in name) #True







