package com.lld.LoggingFramework;

public class DBLogger implements ILogger{
    private final String databaseIp;

    public DBLogger(String databaseIp) {
        this.databaseIp = databaseIp;
    }

    public String getDatabaseIp() {
        return databaseIp;
    }

    @Override
    public void log(Log log) {
        System.out.println(log.getLocalDateTime() + ": " + log.getLogLevel() + ": "+log.getContent());
    }
}
