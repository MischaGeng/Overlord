package com.overlord.designpatterns.Template;

public class AnimalFactory extends AbstractFactory {
    @Override
    public String getName() {
        return "dog";
    }
}
