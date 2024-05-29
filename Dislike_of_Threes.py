l=[]
for i in range(0 , 2070):
    if((i%3==0) or ((str(i)[::-1][0])=='3')):
        pass
    else:
        l.append(i)
test=int(input())
for i in range(test):
    print(l[int(input())-1])
