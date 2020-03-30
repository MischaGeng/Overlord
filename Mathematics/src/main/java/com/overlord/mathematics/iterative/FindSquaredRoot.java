package com.overlord.mathematics.iterative;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/03/30
 * @Since JDK 1.8
 * @Title: FindSquaredRoot
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class FindSquaredRoot {

    public static void main(String[] args) {
        int number = 100;
        double squareRoot = FindSquaredRoot.getSquareRoot(number, 0.000001, 10000);
        if (squareRoot == -1.0) {
            System.out.println("请输入大于1的整数");
        } else if (squareRoot == -2.0) {
            System.out.println("未能找到解");
        } else {
            System.out.println(String.format("%d的平方根是%f", number, squareRoot));
        }

    }

    public static double getSquareRoot(int n, double deltaThreshold, int maxTry) {

        if (n < 1) {
            return -1.0;
        }

        double min = 1.0;
        double max = (double) n;

        for (int i = 0; i < maxTry; i++) {

            double middle = (min + max) / 2;
            double square = middle * middle;

            double delta = Math.abs((square / n) - 1);
            if (delta <= deltaThreshold) {
                System.out.println(i);
                return middle;
            } else {
                if (square > n) {
                    max = middle;
                } else {
                    min = middle;
                }
            }

        }

        return -2.0;
    }
}
