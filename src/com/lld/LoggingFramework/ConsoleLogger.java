package com.lld.LoggingFramework;

public class ConsoleLogger implements ILogger{
    public ConsoleLogger() {
    }

    @Override
    public void log(Log log) {
        System.out.println(log.getLocalDateTime() + ": " + log.getLogLevel() + ": "+log.getContent());
    }
}
