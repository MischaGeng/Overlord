package com.overlord.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹  容器构件
 */
public class Folder implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    protected Folder(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void delete(Component c) {
        components.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

    @Override
    public void operate() {
        System.out.println("打开文件夹-->" + this.name);
        for(Component component : components){
            component.operate();
        }
    }
}
