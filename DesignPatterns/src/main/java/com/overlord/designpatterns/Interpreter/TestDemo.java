package com.overlord.designpatterns.Interpreter;

import com.overlord.designpatterns.Interpreter.Context.Context;
import com.overlord.designpatterns.Interpreter.NonterminalExpression.MinusOperation;
import com.overlord.designpatterns.Interpreter.NonterminalExpression.PlusOperation;
import com.overlord.designpatterns.Interpreter.TerminalExpression.TerminalExpression;

public class TestDemo {
    public static void main(String[] args) {

        // 定义终结符表达式
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");
        TerminalExpression c = new TerminalExpression("c");

        // 定义上下文, 添加终结表达式
        Context context = new Context();
        context.addExpression(a, 4);
        context.addExpression(b, 8);
        context.addExpression(c, 2);

        // 调用非终结表达式，实现 4+8-2 的解析
        System.out.println(new MinusOperation(new PlusOperation(a,b), c).interpreter(context));
    }
}
