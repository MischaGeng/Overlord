package com.overlord.mathematics.recursive;

import java.util.ArrayList;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/03/30
 * @Since JDK 1.8
 * @Title: FindKinds
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class FindKinds {
    private static int sumOfKinds = 0;

    private static final long[] RECORDS = {1, 2, 5, 10};

    public static void main(String[] args) {

//        sumKindsByRecur(0);
//
//        System.out.println(sumOfKinds);

        int totalReward = 10;

        get(totalReward, new ArrayList<Long>());

    }

    public static void sumKindsByRecur(long sumOfNum) {

        if (10 == sumOfNum) {
            sumOfKinds++;
            return;
        }

        if (10 < sumOfNum) {
            return;
        }

        for (int i = 0; i < RECORDS.length; i++) {

            //千万不要改变上一个方法中的局部变量
//            sumOfNum = sumOfNum + RECORDS[i];
//            sumKindsByRecur(sumOfNum);

            sumKindsByRecur(sumOfNum + RECORDS[i]);
        }
    }

    private static void get(long totalReward, ArrayList<Long> result) {

        if (0 == totalReward) {
            System.out.println(result);
            return;
        }

        if (totalReward < 0) {
            System.out.println(totalReward);
            return;
        } else {

            for (int i = 0; i < RECORDS.length; i++) {

                ArrayList<Long> newReult = (ArrayList<Long>) (result.clone());

                newReult.add(RECORDS[i]);

                long remaid = totalReward - RECORDS[i];
                System.out.println(totalReward);
                get(remaid, newReult);

//                get(totalReward - RECORDS[i], newReult);
            }

        }

    }
}
