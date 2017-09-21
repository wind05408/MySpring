package com.dk.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with MySpring
 *
 * @author dk05408
 * @Description:
 * @create 2017-09-21 11:45
 **/
@RestController
@EnableAutoConfiguration
public class TestBoot {

    @RequestMapping("/")
    String home() {
        return "Hello World,Spring boot!";
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
        return "Hello "+myName+"!!!";
    }
}
