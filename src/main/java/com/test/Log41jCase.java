package com.test;

import org.apache.log4j.Logger;
/***
 *
 * 在启动的VM参数上，加上-XX:+TraceClassPaths参数，可以打印加载的路径
 * 或者使用jinfo -pid 可以动态查看jvm加载的相关参数
 *
 *
 */
public class Log41jCase {
    static final Logger log = Logger.getLogger(Log41jCase.class);
    public static void main(String[] args) {
        log.info("使用log4j 1.x 打印log");
        System.out.println("log4j 1.x");
    }


}
