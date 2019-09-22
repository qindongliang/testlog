package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/***
 *
 * 在启动的VM参数上，加上-XX:+TraceClassPaths参数，可以打印加载的路径
 * 或者使用jinfo -pid 可以动态查看jvm加载的相关参数
 *
 *
 */
public class Slf4jCase {
    private static final Logger log = LoggerFactory.getLogger(Slf4jCase.class);
    public static void main(String[] args) {
        log.info("info");
        log.warn("warn");
        log.error("error");

    }

}
