package com.overlord.designpatterns.composite;

/**
 * 抽象构件，定义所有操作
 */
public interface Component {
    void add(Component c);
    void delete(Component c);
    Component getChild(int i);
    void operate();
}
