"""
Exercise: Word Counter

1. Write a sentence to 'sample.txt'.
2. Read the file back.
3. Count the number of words in it.
"""

# Write
with open("sample.txt", "w") as f:
    f.write("Python is very fun to learn")

# Read and Count
with open("sample.txt", "r") as f:
    content = f.read()
    words = content.split()
    print("Content:", content)
    print("Word Count:", len(words))
