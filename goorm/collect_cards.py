# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
user_input = input().split()

card = set()

for i in range(int(user_input[1])):
    card.add(int(input()))

    if len(card) == int(user_input[0]):
        break

if len(card) < int(user_input[0]):
    print(-1)
else:
    print(i+1)
