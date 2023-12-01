# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
user_input = input().split()

result1 = eval(user_input[0])
result2 = eval(user_input[1])

print(result1 if result1 > result2 else result2)
