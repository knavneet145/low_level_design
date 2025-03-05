package com.lld.LoggingFramework;

import java.time.LocalDateTime;

public class Log {
    private final String content;
    private final LocalDateTime localDateTime;
    private final LogLevel logLevel;

    public Log(String content, LocalDateTime localDateTime, LogLevel logLevel) {
        this.content = content;
        this.localDateTime = localDateTime;
        this.logLevel = logLevel;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }
}
