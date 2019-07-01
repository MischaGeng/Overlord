package com.overlord.designpatterns.Interpreter.NonterminalExpression;

import com.overlord.designpatterns.Interpreter.AbstractExpression.AbstractExpression;
import com.overlord.designpatterns.Interpreter.Context.Context;

// 非终结符表达式
public class NonTerminalExpression implements AbstractExpression {

    AbstractExpression e1;
    AbstractExpression e2;

    public NonTerminalExpression(AbstractExpression e1, AbstractExpression e2){

        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public int interpreter(Context context) {
        return null;
    }
}
