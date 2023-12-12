# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
num = int(input())

cnt = 1
for i in range(num):
    for j in range(num):
        print(cnt, end="")
        cnt += 1
        if j + 1 == num:
            print('')
        else:
            print(' ', end="")
