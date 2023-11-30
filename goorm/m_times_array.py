# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
user_input = input().split()
lists = input().split()

if int(user_input[0]) == len(lists):
    for i in range(len(lists)):
        if int(lists[i]) % int(user_input[1]) != 0:
            lists[i] = str(int(lists[i]) * int(user_input[1]))

print(' '.join(lists))
