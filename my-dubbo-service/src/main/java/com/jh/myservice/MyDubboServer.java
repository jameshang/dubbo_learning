package com.jh.myservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDubboServer {

    private static final Logger logger = LoggerFactory.getLogger(MyDubboServer.class);

    public boolean ping() {
        return true;
    }

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/config/spring.xml")) {

            context.start();

            logger.info("dubbo service begin to start");
            System.in.read();
        } catch (Exception e) {
            logger.error("", e);
        }
    }

}
