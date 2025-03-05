package com.lld.LoggingFramework;

public class FileLogger implements ILogger{
    private final String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public  void log(Log log) {
        System.out.println(log.getLocalDateTime() + ": " + log.getLogLevel() + ": "+log.getContent());
    }
}
