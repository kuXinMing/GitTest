# 如果春天没有花朵，如果蓝天没有彩霞，如果人生没有追求，那么，这个世界的一切一切，都将失去存在的意义。

# 1 if 5>3 else 3
# print("1：是，0：否")
# ((print("如果人生你，那么，这个世界的一切一切，都将失去存在的意义。") if input("如果人生没有追求?")=="1" else print("有追求，追求啊。")) if input("有花，玩花去，\n算了再问一下如果蓝天没有彩霞?")=="1" else print("不玩了，有彩霞你玩彩霞吧"))  if input("如果春天没有花朵")=="0" else (print("有花朵玩个锤子，玩你的花去") if input("n你真要春天没有花朵吗？")=="0" else ((print("那么，这个世界的一切一切，都将失去存在的意义。") if input("如果人生没有追求？")=="1" else print("有追求还不去追求，玩个锤子")) if input("那么如果蓝天没有彩霞？")=="1" else input("万彩霞去吧，不跟你玩了")))
#



# def add(n):
#     if(n<=0):
#         return 0;
#     else:
#         return add(n-1)+n;
#
# print(add(100))

# def fa(n):
#     if n==1 :
#         return 1;
#     else:
#         return n * fa(n-1);
# number=int(input('请输入一个正数:'))
# re= fa(number)
#
# print("的递归乘是："+str(re))


# 第一种

# import re
#
# inputValue=(input("请输入三个字符的？"))
# if None==re.match("\w{3}",inputValue):
#     print("你输入的不是三个字符或者数字")
# else:
#     print("输入的是数字或字符")
#
# if None==re.match("\d{3}",inputValue):
#     print("你输入的不是三个数字")
# else:
#     print("输入的是数字")
#
# # 第二种
#
# inputValue=(input("请输入三个字符的？"))
# if 3!=len(inputValue):
#     print("你输入的不是三个字母或者数字")
# else:
#     print("输入的是三个")



# try:
#     with open('/Users/wanghao/Desktop/suibian.py','r') as f:
#         for liulin10086 in f:
#             print(liulin10086)
# except OSError as reasson:
#     print("出错了:"+ str(reasson))
#

# try:
#     f=open('/Users/wanghao/Desktop/suibian.py','r')
#     for liulin10086 in f:
#         print(liulin10086)
# except OSError as reasson:
#     print("出错了:"+ str(reasson))
# finally:
#     f.close()
#
# try:
#     with open('/Users/wanghao/Desktop/suibian.py','r') as f:
#         for liulin10086 in f:
#             print(liulin10086)
#         f.__exit__();
# except OSError:
#     print("出错了:"+OSError)




# all = {'username1': "123", 'username2': "345"}
# num=1
# inputUsername=""
# while num<4:
#  username=input("请输入账号？")
#  password=input("请输入密码？")
#  if inputUsername==username:
#      print("输入账号跟上次一样")
#  inputUsername=username
#  if username in all:
#      if all[username]==password:
#          print("你输入的正确")
#          break
#      else:
#          print("密码错误，你还剩余"+str(3-num)+"次机会")
#          num+=1
#  else:
#      print("你输入的账号不存在，你还剩余"+str(3-num)+"次机会")
#      num+=1


# class Demo():
#     def __enter__(self):
#         print("调用__enter__")
#
#     def __exit__(self, exc_type, exc_val, exc_tb):
#             print("调用__exit__")
#
# def get_Demo():
#     return Demo()
#
# with get_Demo() as d:
#     print(d)

# key 账号: value 密码
# all = {'liulin': "123",
#        'wanghao': "456"}
# num=1
# # 上次输入的账号
# inputUsername=None
# inputpassword=None
# while num<4:
#     # 账号
#     username1=input("请输入账号？")
#     # 密码
#     password=input("请输入密码？")
#     if 0!=len(username1)or 0!=len(password):
#         print("你输入的不是三个字母或者数字")
#     elif inputUsername==username1 or inputpassword==password:
#         print("输入账号/密码跟上次一样")
#     inputUsername=username1
#     inputpassword=password
#     if  username1 in all:
#         if password==all[username1]:
#             print("你输入的正确")
#             break
#         else:
#             print("密码错误，你还剩余"+str(3-num)+"次机会")
#     else:
#         print("账号错误，你还剩余"+str(3-num)+"次机会")
#     num+=1
# else:
#     print("游戏结束")

# all = {'username1': "123", 'username2': "345"}
# num=1
# inputUsername="";
# while num<4:
#     username1=input("请输入账号？")
#     password=input("请输入密码？")
#     if 3!=len(username1)or 3!=len(password):
#         print("你输入的不是三个字母或者数字")
#     elif inputUsername==all:
#         print("输入账号跟上次一样")
#     elif  username1 and password in all:
#         if all==username1:
#             print("你输入的正确")
#             break
#     else:
#         print("密码错误，你还剩余"+str(3-num)+"次机会")
#     num+=1
# else:
#     print("你输入的账号不存在，你还剩余"+str(3-num)+"次机会")
#     num+=1
# key : value


# wang 王
# liu  刘




# key value
# zhanghao="username1"
#
# mima="123"
#
#
# print(zhanghao)
# try:
#     1/0
# except IOError as e:
#     print(str(e))