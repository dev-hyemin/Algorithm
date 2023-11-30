# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
user_input = input().split(' ')
# print(round(float(user_input[0]) + float(user_input[1]), 6))
print('{:.6f}'.format(float(user_input[0]) + float(user_input[1])))
