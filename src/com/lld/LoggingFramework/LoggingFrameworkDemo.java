package com.lld.LoggingFramework;

import com.lld.LoggingFramework.Factory.LogFactory;

public class LoggingFrameworkDemo implements Runnable{

    @Override
    public void run() {
        Log log = LogFactory.getInstance("logging in the console", LogLevel.INFO);
        LoggingFrameworkService loggingFrameworkService = new LoggingFrameworkService(DestinationType.CONSOLE, log);
    }
}
