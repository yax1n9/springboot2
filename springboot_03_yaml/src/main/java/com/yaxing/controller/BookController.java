package com.yaxing.controller;

import com.yaxing.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.EventListener;

/**
 * @author yx
 * @date 2022/12/1
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country;
    @Value("${enterprise.area}")
    private String area;
    @Value("${users[0].name}")
    private String name;
    @Value("${tempUrl}")
    private String tempUrl;
    @Value("${tempUrl2}")
    private String tempUrl2;

    // 通过自动装配拿取所有属性
    @Autowired
    private Environment environment;

    // 封装配置中的一个属性
    @Autowired
    private DataSource dataSource;

    @GetMapping
    public String getBook() {
        System.out.println("springboot is running...");
        System.out.println("country: " + country);
        System.out.println("area: " + area);
        System.out.println("name: " + name);
        System.out.println("tempUrl: " + tempUrl);
        System.out.println("tempUrl2: " + tempUrl2);

        System.out.println("------------------------------------");
        // 通过 Environment.getProperty("")拿取属性
        System.out.println(environment.getProperty("users[0].name"));
        System.out.println(environment.getProperty("enterprise.area"));

        System.out.println("------------------------------------");
        // 封装配置中的属性
        System.out.println(dataSource);

        return "springboot is running...";
    }

}
