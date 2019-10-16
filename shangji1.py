import random
temp = input("猜猜我心中的数字:")
guess = int(temp)
secret = random.randint(1,10)
i = 2
while (guess!=secret)and(i):
    if (guess < secret):
        print("猜小了！")
        print("剩余机会次数：",i)
    else:
        print("猜大了！")
        print("剩余机会次数：", i)

    temp = input("猜猜我心中的数字:")
    guess = int(temp)
    i = i - 1
else:
    if(i>0):
        print("猜对！游戏结束！")
    else:
        print("你的机会用完！")