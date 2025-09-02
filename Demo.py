x,y = 1,2
def add(val1,val2):
    print("addition of global varaiables : " ,  x+y)
    print("addition of local varaibles :   " ,  val1+val2)
def mul(val3,val4):
    print("multiply of global variables :" , x*y)
    print("multiply of local variables :" , val3*val4)

add(10,20)
mul(43, 1)

'''
Notes : Recursive function is function that calls itself in its body
'''