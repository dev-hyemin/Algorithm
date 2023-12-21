# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean

number = input().split()

filter_word = input()
word = input()

if len(filter_word) != int(number[0]) or len(word) != int(number[1]):
	print('Invalid Word')

while(True):
	word = word.replace(filter_word, '')
	
	if filter_word not in word:
		break
	
if not word:
	print('EMPTY')
else:
	print(word)
