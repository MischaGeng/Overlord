package com.overlord.designpatterns.chain;

public class ConsoleLogger extends AbstractLog {

    public ConsoleLogger(AbstractLog nextLogger) {
        super(nextLogger);
    }

    @Override
    public void write(String msg) {
        System.out.println("ConsoleLogger:"+msg);
        if (nextLogger != null){
            nextLogger.write(msg);
        }
    }
}
