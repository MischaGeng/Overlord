package com.overlord.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/*
 * @Description: Caretaker 对象负责从 Memento 中恢复对象的状态
 *
 * @author MischaGeng
 * @Created Date: 2019/06/30
 * @Since JDK 1.8
 * @Title: CareTaker
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
