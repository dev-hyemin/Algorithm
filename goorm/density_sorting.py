# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
count = int(input())
max_index = 0
max_density = 0
max_weight = 0

for i in range(count):
    event = input().split()
    density = float(event[0])/float(event[1])

    is_change = False
    if max_density < density:
        is_change = True
    elif max_density == density and max_weight < float(event[0]):
        is_change = True

    if is_change:
        max_index = i+1
        max_density = density
        max_weight = float(event[0])

print(max_index)
