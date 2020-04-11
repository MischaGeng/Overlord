package com.overlord.algorithm.sort;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/04/07
 * @Since JDK 1.8
 * @Title: SwapSort
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class SwapSort {

    public static int[] sort(int[] array) {

        if (0 == array.length || 1 == array.length) return array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }

        return array;
    }

}
