package com.overlord.designpatterns.memento;

/*
 * @Description: Originator 创建并在 Memento 对象中存储状态
 *
 * @author MischaGeng
 * @Created Date: 2019/06/30
 * @Since JDK 1.8
 * @Title: Originator
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }


}
