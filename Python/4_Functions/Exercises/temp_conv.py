"""
Exercise: Temperature Converter

1. Create a function 'c_to_f(c)' converting Celsius to Fahrenheit.
2. Create a function 'f_to_c(f)' converting Fahrenheit to Celsius.
3. Test both.
"""

def c_to_f(c):
    return (c * 9/5) + 32

def f_to_c(f):
    return (f - 32) * 5/9

print("30C in F:", c_to_f(30))
print("86F in C:", f_to_c(86))
