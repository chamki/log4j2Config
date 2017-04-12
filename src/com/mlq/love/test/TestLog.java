package com.mlq.love.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class TestLog {
	
	private static final Logger log = LogManager.getLogger(TestLog.class);
	
    public static void main(String[] args) {
        new Thread(() -> {
            ThreadContext.put("ROUTINGKEY", Thread.currentThread().getName());
            log.info("info");
            log.debug("debug");
            log.error("error");
            ThreadContext.remove("ROUTINGKEY");
        }).start();
        new Thread(() -> {
            ThreadContext.put("ROUTINGKEY", Thread.currentThread().getName());
            log.info("info");
            log.debug("debug");
            log.error("error");
            ThreadContext.remove("ROUTINGKEY");
        }).start();
    }
}
