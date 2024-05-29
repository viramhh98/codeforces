l=[
    [],
    [],
    [],
    []
]
test_case=int(input())
for i in range(test_case):
    f=int(input())
    l[f].append(i+1)
ans=[]

while True:
    if (len(l[1])!=0) and(len(l[2])!=0) and (len(l[3])!=0):
        ans.append([l[1].pop(),l[2].pop(),l[3].pop()])
    else:
        break
print(len(ans))
for i in ans:
    print(i[0],  " " , i[1] ,  " ",i[2])