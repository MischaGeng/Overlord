package com.overlord.mathematics.iterative;

import java.util.Arrays;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/03/30
 * @Since JDK 1.8
 * @Title: BinarySearch
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class BinarySearch {
    public static void main(String[] args) {
        String[] dictionary = {"i", "am", "one", "of", "the", "authors", "in", "geekbang"};

        Arrays.sort(dictionary);

        String wordToFind = "ok";

        boolean found = BinarySearch.search(dictionary, wordToFind);
        if (found) {
            System.out.println(String.format("找到了单词%s", wordToFind));
        } else {
            System.out.println(String.format("未能找到单词%s", wordToFind));
        }
    }

    private static boolean search(String[] dic, String str) {

        int min = 0;
        int max = dic.length - 1;

        while (true) {

            int middle = (min + max) / 2;

            if (str.equals(dic[middle])) {
                return Boolean.TRUE;
            }

            if (str.compareTo(dic[middle]) < 0) {

                max = middle - 1;
            } else {
                min = middle + 1;
            }

            if (max < min) {
                return Boolean.FALSE;
            }
        }

    }

}
