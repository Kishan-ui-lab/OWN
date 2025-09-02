'''
Created on Aug 17, 2021

@author: kishankumar
'''
from test.test_warnings.data.stacklevel import inner

def outer():
    name="Kishan"
    def inner():
        nonlocal name
        name="kumar"
        print("good evening : " , name)
        
    inner()
    print(name)
outer()