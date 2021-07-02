n = input()
joi = [500, 100, 50, 10, 5, 1]
money = 1000 - int(n)
count = 0
for i in joi:
    count += money // i
    money = money % i
print(count)
