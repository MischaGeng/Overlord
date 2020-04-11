package com.overlord.algorithm.guess;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/04/11
 * @Since JDK 1.8
 * @Title: TestMain
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class TestMain {

    public static void main(String[] args) {
//        while (true) {
//            System.out.println(random4Num());
//        }

        GiveNum giveNum = new GiveNum(1342);

        GuessNum guessNum = new GuessNum(giveNum);

        guessNum.EightChances();



    }


}



