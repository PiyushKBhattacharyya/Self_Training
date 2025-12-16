"""
Exercise: Prime Checker

1. Ask user for a number.
2. Check if it is a prime number.
3. Print "Prime" or "Not Prime".
"""

num = int(input("Enter a number: "))

if num > 1:
    is_prime = True
    for i in range(2, int(num ** 0.5) + 1):
        if (num % i) == 0:
            is_prime = False
            break
    
    if is_prime:
        print(num, "is Prime")
    else:
        print(num, "is Not Prime")
else:
    print(num, "is Not Prime")
