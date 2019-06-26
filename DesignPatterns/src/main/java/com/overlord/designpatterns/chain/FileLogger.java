package com.overlord.designpatterns.chain;

public class FileLogger extends AbstractLog {

    public FileLogger(AbstractLog nextLogger) {
        super(nextLogger);
    }

    @Override
    public void write(String msg) {
        System.out.println("FileLogger:"+msg);
        if (nextLogger != null){
            nextLogger.write(msg);
        }
    }
}
