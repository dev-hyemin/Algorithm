# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
num = int(input())
sentence = list(input())

if len(sentence) == num:
    for i in range(len(sentence)):
        if sentence[i].isupper():
            sentence[i] = sentence[i].lower()
        else:
            sentence[i] = sentence[i].upper()

print(''.join(sentence))
