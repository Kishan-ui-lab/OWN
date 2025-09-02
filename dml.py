'''
Created on Aug 19, 2021

@author: kishankumar

def kisha(**kum):
    print(kum)
    print(kum.keys())
    print(kum.values()) 
    
    #function calling
#kisha(e=22,f=34,g=35)
'''
from re import purge
from colorsys import rgb_to_hls
'''
s[begin:end]
returns substring from begin index to end-1 index
'''
s='durga'
s[1:4]==>urg
s[2:4]==>rg
s[1:]==> urga
s[:]==>durga
s[:4]=durg(begining to end-1)
s[-4:-1]==>urg
s='durgasoftwaresolutions'
s[1:10]=urgasoftw
s[1:10:2]:ugsfw
s='durga'
s*3==durgadurgadurga
s='durga'
len(s)==>5