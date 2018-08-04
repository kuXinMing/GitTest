package cn.wh.utils;



import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * 排序算法
 *DESC 是descend 降序意思 asc 是ascend 升序的意思
 * @author wanghao
 * @create 2018-08-03 上午11:22
 **/
public class SortArray {

    private static int [] array = new int [10];
    static {
        for (int i = 0; i < 10; i++) {
            array[i]=(int)(Math.random()*100);
        }
    }
    // 冒泡算法
    public static int [] BubbleSortASC(int [] array){
        if(array==null || array.length==0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int interim = Integer.MIN_VALUE;
            for (int y = 0; y < array.length-1-i; y++) {
                if(array[y] > array[y+1]){
                    interim = array[y];
                    array[y] = array[y+1];
                    array[y+1] = interim;
                }
            }
        }
        return array;
    }
    // 选择排序
    public static int [] SelectionSortASC(int[] array){
        if(array==null || array.length==0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int indexValue=array[i];
            for (int j = i; j < array.length; j++) {
                if(indexValue > array[j]){
                    indexValue=array[j];
                    array[j]=array[i];
                    array[i]=indexValue;
                }
            }
        }
        return array;
    }
    // 插入排序
    public static int [] InsertionSortASC(int [] array){
        if(array==null || array.length==0){
            return array;
        }
        for (int i = 1; i < array.length; i++) {
            int insetValue = array[i];
            for (int j = i; j >=0; j--) {
                if(j==0 && array[i]<array[j]
                        || j!=0 && array[i]>array[j-1] && array[i]<array[j]){
                    insetValue=array[j];
                    array[j]=array[i];
                    array[i]=insetValue;
                    i--;
                    break;
                }
            }
        }
        return array;
    }

    public static int []  insertionSort(int [] arr) {
        int len = arr.length;
        int preIndex
                , current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array)+"_原始数组");
//        System.out.println(Arrays.toString(BubbleSortASC(array)));
//
//        System.out.println(Arrays.toString(SelectionSortASC(array)));

        System.out.println(Arrays.toString(InsertionSortASC(array)));
        System.out.println(Arrays.toString(insertionSort(array)));





        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
