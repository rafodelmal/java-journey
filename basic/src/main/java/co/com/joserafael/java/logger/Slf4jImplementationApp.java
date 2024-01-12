package co.com.joserafael.java.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jImplementationApp {

    public static void main(String[] args) {
        //Creating the Logger object
        Logger logger = LoggerFactory.getLogger("SampleLogger");

        //Logging the information
        logger.info("Hi This is my first SLF4J program");
    }
}
