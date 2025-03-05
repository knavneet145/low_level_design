package com.lld.LoggingFramework;

public class LoggingFrameworkService {
    private DestinationType destinationType;
    private Log log;
    private ILogger logger;

    public LoggingFrameworkService(DestinationType destinationType, Log log) {
        setDestinationType(destinationType);
        setLog(log);
    }

    public void setDestinationType(DestinationType destinationType) {
        switch (destinationType) {
            case CONSOLE:
                logger = new ConsoleLogger();
                break;
            case DATABASE:
                logger = new DBLogger("sql_db");
                break;
            case FILE:
                logger = new FileLogger("localfile.txt");
                break;
        }
        this.destinationType = destinationType;
    }

    public void setLog(Log log) {
        this.log = log;
        logger.log(log);
    }

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public Log getLog() {
        return log;
    }
}
