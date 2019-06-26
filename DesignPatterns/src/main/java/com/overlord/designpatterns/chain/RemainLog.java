package com.overlord.designpatterns.chain;

public class RemainLog extends AbstractLog {

    public RemainLog(AbstractLog nextLogger) {
        super(nextLogger);
    }

    @Override
    public void write(String msg) {
        System.out.println("remainlog:"+msg);
        if (nextLogger != null){
            nextLogger.write(msg);
        }
    }
}
