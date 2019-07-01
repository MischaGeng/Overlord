package com.overlord.designpatterns.Interpreter.Context;

import com.overlord.designpatterns.Interpreter.AbstractExpression.AbstractExpression;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<AbstractExpression, Integer> map = new HashMap<>();

    // 添加终结表达式
    public void addExpression(AbstractExpression s, Integer value){
        map.put(s, value);
    }

    // 获取终结表达式的值
    public int getExpression(AbstractExpression s){
        return map.get(s);
    }

}
