package com.yaxing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public String getBook() {
        System.out.println("springboot is running...");
        System.out.println("country: " + country);
        System.out.println("area: " + area);
        System.out.println("name: " + name);
        System.out.println("tempUrl: " + tempUrl);
        System.out.println("tempUrl2: " + tempUrl2);
        return "springboot is running...";
    }

}
