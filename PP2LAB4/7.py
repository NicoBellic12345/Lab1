def function():
    n = int(input())
    for i in range(0, n):
        if i % 3 == 0 or i % 4 == 0:
            print(i)
function()