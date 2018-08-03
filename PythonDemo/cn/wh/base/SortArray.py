#
#  排序算法
#  DESC 是descend 降序意思 asc 是ascend 升序的意思
#  @author wanghao
#  @create 2018-08-03 上午11:22
#
import random


array=[]
for i in range(10):
    array.append(random.randint(0,100))


# 冒泡排序
# def BubbleSortASC(array):
#     if array==None or len(array)==0:
#         return  array
#     for i in range(len(array)-1):
#         interim=0
#         for y in range(len(array)-1-i):
#             if array[y]> array[y+1]:
#                 interim=array[y]
#                 array[y]=array[y+1]
#                 array[y+1]=interim
#     return array
#
# print(BubbleSortASC(array))
# print(sorted(array))

# 选择排序
# def SelectionSortASC(array):
#     if array==None or len(array)==0:
#         return  array
#     for i in range(len(array)):
#         selectValue=array[i]
#         for y in range(len(array)):
#             if selectValue > array[y]:
#                 selectValue=array[y]
#                 array[y]=array[i]
#                 array[i]=selectValue
#     return array
# print(SelectionSortASC(array))
# print(sorted(array))
