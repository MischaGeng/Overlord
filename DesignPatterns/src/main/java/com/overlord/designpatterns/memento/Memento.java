package com.overlord.designpatterns.memento;

/*
 * @Description: Memento 包含了要被恢复的对象的状态
 *
 * @author MischaGeng
 * @Created Date: 2019/06/30
 * @Since JDK 1.8
 * @Title: Memento
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
