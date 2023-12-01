# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
num = int(input())

grid = []
x = 0
y = 0
for i in range(num):
    temp = input().split()
    grid.append(temp)

    if '0' in temp:
        x = i
        y = temp.index('0')

result = 0
for g in range(len(grid)):
    for j in range(len(grid[g])):
        if g == x or j == y:
            result += int(grid[g][j])

print(result)