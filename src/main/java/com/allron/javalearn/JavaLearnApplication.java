package com.allron.javalearn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类
 *
 * @author Allron
 * @date 19/7/19
 */
@SpringBootApplication
@Slf4j
@RestController
public class JavaLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaLearnApplication.class, args);
    }

    @GetMapping("/hello.do")
    public String hello() {

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");

        log.info("test push！");
        return "hello worldabc";
    }

}
