
numbers = [int(input()) for _ in range(5)]


average = sum(numbers) // len(numbers)

numbers.sort()
median = numbers[len(numbers) // 2]

print(average)
print(median)
