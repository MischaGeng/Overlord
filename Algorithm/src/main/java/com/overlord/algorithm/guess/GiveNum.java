package com.overlord.algorithm.guess;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2020/04/10
 * @Since JDK 1.8
 * @Title: GiveNum
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class GiveNum {

    private int num;

    public GiveNum(int num){
        this.num = num;
    }


    public String guessResult(int guessNum){

        if(guessNum == num) {
            return "4A0B";
        }

        return "false";
    }



}
