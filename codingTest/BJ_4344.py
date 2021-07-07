n = input()
for i in range(int(n)):
    array = map(int, input().split())
    array = list(array)

    sum = 0
    for j in range(array[0]):
        sum += array[j+1]
    avg = sum / array[0]

    count = 0
    for k in range(array[0]):
        if array[k+1] > avg:
            count += 1
    result = count / array[0] * 100
    print("%.3f%%" % result)
