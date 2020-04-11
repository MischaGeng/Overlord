package com.overlord.algorithm.sort;

import java.util.Arrays;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/04/06
 * @Since JDK 1.8
 * @Title: ArraySort
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class ArraySort {

    public static void main(String[] args) {

        int[] array1 = {2};
        int[] array2 = {20,13,3,17,5,11,7,4,9,10,12};

//        System.out.println(Arrays.toString(BubbleSort.sort(array1)));
//        System.out.println(Arrays.toString(BubbleSort.sort(array2)));
//
//        System.out.println(Arrays.toString(SelectionSort.sort(array1)));
//        System.out.println(Arrays.toString(SelectionSort.sort(array2)));
//
//        System.out.println(Arrays.toString(InsertionSort.sort(array1)));
//        System.out.println(Arrays.toString(InsertionSort.sort(array2)));

        System.out.println(Arrays.toString(SwapSort.sort(array1)));
        System.out.println(Arrays.toString(SwapSort.sort(array2)));
    }
}
