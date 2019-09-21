package com.dong;

import org.apache.log4j.Logger;

public class Log4j1Case {
    static final Logger log = Logger.getLogger(Log4j1Case.class);
    public static void main(String[] args) {
        log.info("使用log4j 1.x 打印log");
        System.out.println("log4j 1.x");
    }


}
