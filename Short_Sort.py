def main():
    a=int(input())
    for i in range(0,a):
        b=input()
        c=''.join(sorted(b))
        count=0
        for j in b:
            if(b.index(j)!=c.index(j)):
                count+=1
        if(count==0 or count ==2):
            print("yes")
        else:
            print("no")
if __name__ == "__main__":
    main()