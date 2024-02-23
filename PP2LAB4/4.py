import datetime
day1 = datetime.datetime(2024, 2, 15, 18, 50, 33, 123456)
day2 = datetime.datetime(2023, 1, 15, 18, 50, 33, 123456)
dif = (day1 - day2).total_seconds()
print(dif)