
#!/bin/python3

import sys


n = int(input().strip())
binary_n = list(bin(n))
consecutive = 0
maximum = 0
for i in range(len(binary_n)):
    if binary_n[i] == '1':
        consecutive+=1
    else:
        consecutive = 0
    maximum = max(consecutive, maximum)

print(maximum)
