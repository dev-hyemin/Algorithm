# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
user_input = input().split()

num = int(user_input[0])
queue_size = int(user_input[1])

queue = []
for _ in range(num):
    command = input().split()

    if command[0] == 'push':
        if len(queue) == queue_size:
            print('Overflow')
        else:
            queue.append(int(command[1]))

    elif command[0] == 'pop':
        if len(queue) == 0:
            print('Underflow')
        else:
            print(queue.pop())
