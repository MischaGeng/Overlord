package com.overlord.designpatterns.Interpreter.NonterminalExpression;

import com.overlord.designpatterns.Interpreter.AbstractExpression.AbstractExpression;

// 非终结符表达式
public class NonTerminalExpression implements AbstractExpression {

    AbstractExpression e1;
    AbstractExpression e2;

    public NonTerminalExpression(AbstractExpression e1, AbstractExpression e2){

        this.e1 = e1;
        this.e2 = e2;
    }
}
