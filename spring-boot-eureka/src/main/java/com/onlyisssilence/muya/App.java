package com.onlyisssilence.muya;

import com.onlyisssilence.muya.utils.DateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("hello")
    public String hello(){
        return DateUtils.getCurrentTime();
    }
}
