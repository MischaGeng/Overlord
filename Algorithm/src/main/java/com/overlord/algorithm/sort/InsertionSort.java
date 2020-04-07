package com.overlord.algorithm.sort;

import java.util.Arrays;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/04/06
 * @Since JDK 1.8
 * @Title: InsertionSort
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class InsertionSort {

    public static int[] sort(int[] array) {

        if (0 == array.length || 1 == array.length) return array;

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int current = array[i];
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }
}
