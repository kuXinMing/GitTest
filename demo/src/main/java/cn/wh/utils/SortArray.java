package cn.wh.utils;

import com.sun.tools.javac.util.ArrayUtils;

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
//            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array)+"_原始数组");
        System.out.println(Arrays.toString(BubbleSortASC(array)));

        System.out.println(Arrays.toString(SelectionSortASC(array)));





        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
