package com.jh.myclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jh.myservice.service.IProduct;

public class MyDubboClient {

    private static final Logger logger = LoggerFactory.getLogger(MyDubboClient.class);

    public boolean ping() {
        return true;
    }

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/config/spring.xml")) {

            context.start();

            IProduct service = context.getBean(IProduct.class);

            Long pId = service.getProductId();
            String pName = service.getProductName();

            logger.info("Product: " + pName + ", ID: " + pId);
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
