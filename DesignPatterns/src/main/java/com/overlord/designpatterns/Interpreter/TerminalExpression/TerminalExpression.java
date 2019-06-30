package com.overlord.designpatterns.Interpreter.TerminalExpression;

import com.overlord.designpatterns.Interpreter.AbstractExpression.AbstractExpression;
import com.overlord.designpatterns.Interpreter.Context.Context;

// 终结符表达式
public class TerminalExpression  implements AbstractExpression {

    String variable;

    public TerminalExpression(String variable){
        this.variable = variable;
    }

    @Override
    public int interpreter(Context context) {
        return context.getExpression(this);
    }
}
