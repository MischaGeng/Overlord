package com.overlord.algorithm.sort;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/04/06
 * @Since JDK 1.8
 * @Title: BubbleSort
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class BubbleSort {

    public static int[] sort(int[] array) {

        if (0 == array.length || 1 == array.length) return array;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

}
