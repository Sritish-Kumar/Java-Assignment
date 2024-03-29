import itertools
s= "abcd"

for i in range(len(s)):
    str = s[i]
    for j in range(i+1,len(s)):
        rev = s[i+1:len(s)]