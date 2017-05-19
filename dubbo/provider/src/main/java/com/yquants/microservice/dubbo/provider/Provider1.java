package com.yquants.microservice.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wei on 2017/5/19.
 */
public class Provider1 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider1.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
