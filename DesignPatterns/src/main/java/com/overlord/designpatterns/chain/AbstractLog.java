package com.overlord.designpatterns.chain;

public abstract class AbstractLog {
    protected AbstractLog nextLogger;

    public AbstractLog(AbstractLog nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void writeLog(String msg){
        write(msg);
        if (nextLogger != null){
            this.nextLogger.write(msg);
        }
    }
    public abstract void write(String msg);
}
