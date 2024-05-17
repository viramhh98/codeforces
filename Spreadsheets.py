def main():
    t = int(input())
    for _ in range(t):
        s = input()
        ct = s.count('R') + s.count('C')
        if ct == 2 and s[1].isdigit():
            s1 = ''
            flag = False
            for i in range(len(s)):
                if s[i - 1] == 'C' or flag:
                    s1 += s[i]
                    flag = True
            az = int(s1)
            ans1 = ''
            while az > 0:
                a = az % 26
                if a == 0:
                    ans1 = 'Z' + ans1
                    az = az // 26 - 1
                else:
                    ans1 = chr(64 + a) + ans1
                    az = az // 26
            ans23 = ""
            x1 =s.index('C')
            x2 = s[1:x1]
            # print()
            print(ans1+ x2)
        else:
            s1 = ''.join([char for char in s if char.isalpha()])
            temp=  ""
            for i in s:
                if i>='0' and i <='9':
                    temp = temp+i
            
            alpha = {}
            a= 64
            for i in range(1,27):
                alpha[chr(a+i)]=i
            
            n  = len(s1)
            # print(alpha)
            x =0
            for i in range(n):
                ax = alpha[s1[i]]
                x += (26**(n-i-1))*ax
            result = 'R' + str(temp) + 'C' + str(x)
            print(result)
 
            
 
if __name__ == "__main__":
    main() 