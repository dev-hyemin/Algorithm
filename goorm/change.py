# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
change = int(input())
cnt = 0

cnt += (change//40)
change = change % 40
cnt += (change//20)
change = change % 20
cnt += (change//10)
change = change % 10
cnt += (change//5)
change = change % 5

cnt += change

print(cnt)
