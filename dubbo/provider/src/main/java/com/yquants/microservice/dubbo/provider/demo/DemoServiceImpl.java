package com.yquants.microservice.dubbo.provider.demo;


import com.yquants.microservice.dubbo.inter.demo.DemoService;

import java.lang.management.ManagementFactory;

/**
 * Created by Wei on 2017/5/19.
 */
public class DemoServiceImpl implements DemoService {

    private final String processName;
    public DemoServiceImpl() {
        processName = ManagementFactory.getRuntimeMXBean().getName();
    }

    public String sayHello(String str) {
        return "Hello " + str + " from" + processName;
    }
}
