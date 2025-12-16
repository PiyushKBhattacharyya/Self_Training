"""
Exercise: Days Until New Year

1. Import the 'datetime' module.
2. Get the current date.
3. Calculate days remaining until next Jan 1st.
"""

import datetime

now = datetime.date.today()
next_year = now.year + 1
new_year = datetime.date(next_year, 1, 1)

remaining = new_year - now
print(f"Days until {next_year}: {remaining.days}")
