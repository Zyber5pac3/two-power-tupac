'''
Created on 23-Aug-2014

@author: zubair-abid
'''
def binary():
    n = int(input("Enter index value: "))
    k = n*"0"
    return "1"+k


def integral():
    n = int(input("Enter index value: "))
    dig = 0; itw = 0 ; rem = 0 ; lent = 0;
    num = "1" ; newt = ""
    
    for i in range(1 , n + 1):
        newt = ""
        num = "0" + num
        lent = len(num) -1 ;
        rem = 0;    
        
        while lent >= 0:
            dig = num[lent : lent+1]
            itw = int(dig) * 2
            newt = str(itw % 10+ rem) + newt;
            lent -= 1
            
            rem = itw // 10;
        
        if newt[0]=='0' :
            num = newt[1: len(newt)+1];                                                                    
        else:
            num = newt;
        print(str(i)+"\t\t\t:\t\t\t"+num);
    return num


while True:
    integral()
        
