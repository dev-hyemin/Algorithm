# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
num = int(input())

result = 1
for i in range(1, num+1):
    result *= i

print(result % 1000000007)
