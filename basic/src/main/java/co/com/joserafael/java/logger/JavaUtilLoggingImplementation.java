package co.com.joserafael.java.logger;

import java.util.logging.Logger;

public class JavaUtilLoggingImplementation {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(JavaUtilLoggingImplementation.class.getName());
        logger.info("Hi This is my first Java Util Logging program");
    }
}
