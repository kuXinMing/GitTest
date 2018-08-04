#
#  排序算法
#  DESC 是descend 降序意思 asc 是ascend 升序的意思
#  @author wanghao
#  @create 2018-08-03 上午11:22
#
import random


array=[1,3,8,5,6,7,2,5,4,5]
# for i in range(10):
#     array.append(random.randint(0,100))


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
#         for y in range(i,len(array)):
#             if selectValue > array[y]:
#                 selectValue=array[y]
#                 array[y]=array[i]
#                 array[i]=selectValue
#     return array
# print(SelectionSortASC(array))
# print(sorted(array))

# 插入排序未完成
# def InsertionSortASC(array):
#     if array==None or len(array)==0:
#         return  array
#     for i in range(len(array)):
#         insetValue=array[i]
#         for y in range(i,0,-1):
#             if (y == 0 and array[y] > array[i]) \
#                     or (y != 0 and array[y - 1] < array[i] < array[y]):
#                 insetValue=array[y]
#                 array[y]=array[i]
#                 array[i]=insetValue
#                 i-=1
#                 break
#     return array

def InsertionSortASC(array):
    if array==None or len(array)==0:
        return  array
    index=1
    while index<len(array):
        insetValue=array[index]
        for y in range(index,0,-1):
            if (y == 0 and array[y] > array[index]) \
                    or (y != 0 and array[y - 1] < array[index] < array[y]):
                insetValue=array[y]
                array[y]=array[index]
                array[index]=insetValue
                index-=1
                break
        index+=1
    return array

print(sorted(array))
print(InsertionSortASC(array))

