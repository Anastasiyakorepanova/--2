import matplotlib.pyplot as plt

import random
import time

a = []
t0 = 0



def _min():
    minn = 10^20
    for i in a:
        if (minn > i):
            minn = i

    return minn
def _max():
    maxx = -10^20
    for i in a:
        if (maxx < i):
            maxx = i
    return maxx
    
def _sum():
    summ = 0
    for i in a:
        summ += i
    return summ

def _mult():
    mult = 1
    for i in a:
        mult *= i
    return mult
k=0
x=list(range(0,1000))
y=[]
for i in range(1, 1001):
    n = k
    t0 = time.time()
    a.clear()
    for i in range(1, n + 1):
        a.append(random.randint(-10^20, 10^20))
    k = k + 100
    _min()
    _max()
    _sum()
    _mult()
    t1 = time.time() - t0
    y.append(t1)
print('1')
plt.plot(x,y)
plt.show()
