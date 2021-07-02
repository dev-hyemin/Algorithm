n = input()
# map을 사용해 공백기준으로 배열을 입력받음
p = list(map(int, input().split()))
p.sort()
count = 0
for i in range(len(p)):
    for j in range(i + 1):
        count += p[j]
print(count)
