package com.klu.junit_testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerClass {

    private static final Logger logger = LoggerFactory.getLogger(LoggerClass.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.info("This is an info message");
        logger.debug("This is a debug message");
    }
}
