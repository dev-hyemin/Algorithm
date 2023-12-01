# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
num = input()
questions = input().split()

if int(num) == len(questions):
    max_num = int(max(questions))

    if len(questions) == 1:
        print(questions[0])

    else:
        score = int(questions[0])

        for i in range(1, len(questions)):
            if (int(questions[i]) - int(questions[i-1])) == 1:
                score += int(questions[i])
            else:
                score = int(questions[i])

            max_num = max(max_num, score)

        print(max_num)
