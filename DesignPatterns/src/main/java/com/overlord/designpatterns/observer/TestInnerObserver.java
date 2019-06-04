package com.overlord.designpatterns.observer;

public class TestInnerObserver {
    public static void main(String[] args){
        Teacher teacher = new Teacher("放假","老师");
        StudentObserver s1 = new StudentObserver("张三");
        StudentObserver s2 = new StudentObserver("李四");
        teacher.addObserver(s1);
        teacher.addObserver(s2);
        teacher.setWork();
    }
}
