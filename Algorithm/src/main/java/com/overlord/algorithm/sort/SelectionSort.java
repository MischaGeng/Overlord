package com.overlord.algorithm.sort;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/04/06
 * @Since JDK 1.8
 * @Title: SelectionSort
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class SelectionSort {

    public static int[] sort(int[] array) {

        if (0 == array.length || 1 == array.length) return array;

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {

                // 每一轮找到最小的值的 下标
                if (array[j] < array[minIndex]) minIndex = j;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }

        return array;
    }

}
