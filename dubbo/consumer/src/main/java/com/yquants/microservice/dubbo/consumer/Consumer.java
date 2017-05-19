package com.yquants.microservice.dubbo.consumer;

import com.yquants.microservice.dubbo.inter.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wei on 2017/5/19.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        for (int i = 0; i < 100; i++) {
            DemoService demoService = (DemoService) context.getBean("demoService");
            System.out.println(demoService.sayHello("world"));
        }
    }
}
