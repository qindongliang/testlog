package com.test;

import org.apache.log4j.Logger;

public class Log41jCase {
    static final Logger log = Logger.getLogger(Log41jCase.class);
    public static void main(String[] args) {
        log.info("使用log4j 1.x 打印log");
        System.out.println("log4j 1.x");
    }


}
