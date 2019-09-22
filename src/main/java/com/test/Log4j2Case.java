package com.test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/***
 *
 * 在启动的VM参数上，加上-XX:+TraceClassPaths参数，可以打印加载的路径
 * 或者使用jinfo -pid 可以动态查看jvm加载的相关参数
 *
 *
 */
public class Log4j2Case {

static final Logger log = LogManager.getLogger(Log4j2Case.class);

    public static void main(String[] args) {
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
