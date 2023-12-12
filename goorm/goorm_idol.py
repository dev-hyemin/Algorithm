# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
num = int(input())

idols = input().split()

indexed_list = [(int(value), index) for index, value in enumerate(idols, start=1)]

sorted_list = sorted(indexed_list, reverse=True)

top_3_indices = [str(index) for _, index in sorted_list[:3]]

print(' '.join(top_3_indices))
