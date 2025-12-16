"""
Exercise: Currency Converter

1. Ask user for amount in USD.
2. Define an exchange rate (e.g., 1 USD = 85 INR).
3. Calculate INR amount.
4. Print result.
"""

usd_amount = float(input("Enter USD Amount: "))
rate = 85.0

# Todo: Calculate
inr_amount = usd_amount * rate

print(f"{usd_amount} USD is {inr_amount} INR")
