# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
num = int(input())

if num == 1:
    print(0)
else:
    result = 1
    fibonacci = [0, 1]

    for n in range(2, num):
        fibonacci.append(result)
        result = fibonacci[n] + fibonacci[n-1]

    print(fibonacci[len(fibonacci)-1] % 1000000007)

"""
a, b = 0, 1
if num == 1:
    print(a)
else:
    for n in range(2, num):
        a, b = a, a+b
    print(b % 1000000007)
"""
