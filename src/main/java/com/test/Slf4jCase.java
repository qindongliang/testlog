package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jCase {
    private static final Logger log = LoggerFactory.getLogger(Slf4jCase.class);
    public static void main(String[] args) {
        log.info("info");
        log.warn("warn");
        log.error("error");

    }

}
