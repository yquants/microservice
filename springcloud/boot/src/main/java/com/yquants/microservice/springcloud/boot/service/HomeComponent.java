package com.yquants.microservice.springcloud.boot.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Wei on 2017/5/21.
 */
@Controller
@ResponseBody
public class HomeComponent {

    @RequestMapping(value = "test")
    public String index() {
        return "Index!!!";
    }

    @RequestMapping(value = "abc")
    public String test() {
        return "tttt!!!";
    }
}
