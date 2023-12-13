# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
num = int(input())

result = 3
for i in range(num-1):
    result *= 2

print(result % 100000007)
