package com.test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Case {
static final Logger log = LogManager.getLogger(Log4j2Case.class);
    public static void main(String[] args) {
        System.out.println(123);
        log.info("123");
        System.out.println(123);
    }
}
