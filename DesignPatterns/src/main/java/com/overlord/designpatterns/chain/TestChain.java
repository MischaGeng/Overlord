package com.overlord.designpatterns.chain;

public class TestChain {
    public static void main(String[] args){
        AbstractLog file = new ConsoleLogger(null);
        AbstractLog remain = new RemainLog(file);
        AbstractLog abstractLog = new ConsoleLogger(remain);
        abstractLog.write("this is logger");
    }
}
