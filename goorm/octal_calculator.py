# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
cnt = int(input())
decimal = input().split()

if cnt == len(decimal):
    sum = 0
    for i in decimal:
        sum += int(i)

    print(oct(sum)[2:])
