package com.overlord.algorithm.guess;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

/*
 * @Description: 暴力破解
 *
 * @author MischaGeng
 * @Created Date: 2020/04/10
 * @Since JDK 1.8
 * @Title: GuessNum
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class GuessNum {

    private GiveNum giveNum;

    public GuessNum(GiveNum giveNum) {
        this.giveNum = giveNum;
    }

    public void EightChances() {

        int times = 0;

        List<Integer> list = new ArrayList<>();
        while (true) {
            int tryNum = random4Num();
            if (list.contains(tryNum)) {
                continue;
            }

            String result = giveNum.guessResult(tryNum);
            if ("4A0B".equals(result)) {
                times++;
                break;
            }
            System.out.println("Failed!, try num: " + tryNum);
            list.add(tryNum);
            times++;
        }

        System.out.println("Try times: " + times);

    }

    private int random4Num() {

        Random random = new Random();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int randomNum = 0;
        while (true) {
            int num = random.nextInt(10);
            if (set.isEmpty() && 0 == num) {
                continue;
            }
            set.add(num);
            if (set.size() > 3) break;
        }

        int index = 1000;
        for (Integer i : set) {
            randomNum += i * index;
            index = index / 10;
        }

        return randomNum;

    }
}
