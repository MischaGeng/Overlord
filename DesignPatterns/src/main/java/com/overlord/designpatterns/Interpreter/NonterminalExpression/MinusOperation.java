package com.overlord.designpatterns.Interpreter.NonterminalExpression;

import com.overlord.designpatterns.Interpreter.AbstractExpression.AbstractExpression;
import com.overlord.designpatterns.Interpreter.Context.Context;

// 非终结符表达式
public class MinusOperation extends NonTerminalExpression {

    public MinusOperation(AbstractExpression e1, AbstractExpression e2) {
        super(e1, e2);
    }

    // 将两个终结表达式相减
    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) - this.e2.interpreter(context);
    }
}
