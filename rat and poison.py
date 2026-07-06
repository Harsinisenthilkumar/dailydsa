n = int(input())
power = 0
for i in range(n) :
      if 2 ** power >= n:
         print(power)
         break
      power += 1