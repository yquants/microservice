package com.yquants.microservice.springcloud.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Wei on 2017/5/21.
 */

@SpringBootApplication
public class SampleController {

      public static void main(String... args) {
        SpringApplication.run(SampleController.class, args);
    }
}
