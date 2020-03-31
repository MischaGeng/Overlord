package com.overlord.mathematics.recursive;

import java.util.Arrays;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/03/31
 * @Since JDK 1.8
 * @Title: MergeSort
 * @ProjectName Overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] to_sort = {3434, 3356, 67, 14, 78667, 387};
        int[] sorted = MergeSort.merge_sort(to_sort);

        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }

    private static int[] merge_sort(int[] to_sort) {

        if (null == to_sort) return new int[0];

        if (1 == to_sort.length) return to_sort;

        int mid = to_sort.length / 2;

        int[] left = Arrays.copyOfRange(to_sort, 0, mid);

        int[] right = Arrays.copyOfRange(to_sort, mid, to_sort.length);

        left = merge_sort(left);
        right = merge_sort(right);

        int[] merged = merge(left, right);

        return merged;

    }

    private static int[] merge(int[] a, int[] b) {

        if (null == a) return new int[0];
        if (null == b) return new int[0];

        int[] merge_one = new int[a.length + b.length];

        int ai = 0, bi = 0, mi = 0;

        while (ai < a.length && bi < b.length) {
            if (a[ai] < b[bi]) {
                merge_one[mi] = a[ai];
                ai++;

            } else {
                merge_one[mi] = b[bi];
                bi++;
            }
            mi++;
        }

        if (ai < a.length) {
            for (int i = ai; i < a.length; i++) {
                merge_one[mi] = a[i];
                mi++;
            }
        } else {
            for (int i = bi; i < b.length; i++) {
                merge_one[mi] = b[i];
                mi++;
            }
        }

        return merge_one;
    }



}
