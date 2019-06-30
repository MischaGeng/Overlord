package com.overlord.designpatterns.Interpreter.AbstractExpression;

import com.overlord.designpatterns.Interpreter.Context.Context;

public interface AbstractExpression {

    int interpreter(Context context);
}
