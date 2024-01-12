package co.com.joserafael.java.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jApiImplementationApp {

    public static void main(String[] args) {
        //Creating the Logger object
        Logger logger = LogManager.getLogger(Log4jApiImplementationApp.class);

        //Logging the information
        logger.info("Hi This is my first Log4j program");
    }
}
