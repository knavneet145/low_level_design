package com.lld.LoggingFramework.Factory;

import com.lld.LoggingFramework.Log;
import com.lld.LoggingFramework.LogLevel;

import java.time.LocalDateTime;

public class LogFactory {
    public static Log getInstance(String content, LogLevel logLevel) {
        return new Log(content, LocalDateTime.now(), logLevel);
    }
}
