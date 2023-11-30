# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
user_input = input().split(' ')
num = user_input[0]
ignore_num = user_input[1]

num_list = input().split(' ')

if len(num_list) != int(num):
    print('False')

cnt = 0
for n in num_list:
    if str(ignore_num) not in str(n):
        cnt += 1

print(cnt)
