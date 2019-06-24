package com.overlord.designpatterns.Template;

public class PersonFactory extends AbstractFactory {
    @Override
    public String getName() {
        return "Tom";
    }

    @Override
    public int getID() {
        return 10;
    }
}
