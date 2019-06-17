package com.overlord.designpatterns.Template;

public abstract class AbstractFactory {
    public void templateQuery(){
        String name = getName();
        int id = getID();
        printInfo(name,id);
    }
    public abstract String getName();

    public int getID(){
        return 1;
    }
    public void printInfo(String name,int age){
        System.out.println(name+":"+age);
    }
}
