"""
Exercise: Frequency Counter

1. Given a list of numbers: [1, 2, 2, 3, 3, 3, 4]
2. Use a dictionary to count the frequency of each number.
3. Print the dictionary.
"""

data = [1, 2, 2, 3, 3, 3, 4, 1, 1, 5]
counts = {}

for num in data:
    if num in counts:
        counts[num] += 1
    else:
        counts[num] = 1

print("Frequencies:", counts)
