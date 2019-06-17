package com.overlord.designpatterns.Template;

public class TestTemplate {
    public static void main(String[] args){
        AbstractFactory factory = new PersonFactory();
        factory.templateQuery();
        AbstractFactory aniFactory = new AnimalFactory();
        aniFactory.templateQuery();
    }
}
