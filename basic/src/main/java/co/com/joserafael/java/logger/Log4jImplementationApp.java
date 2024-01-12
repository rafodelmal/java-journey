package co.com.joserafael.java.logger;

import org.apache.log4j.Logger;

public class Log4jImplementationApp {

    static final Logger logger = Logger.getLogger(Log4jImplementationApp.class);

    public static void main(String[] args) {
        logger.debug("Debug message");
    }
}
