package com.yaxing.controller;

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

    @GetMapping
    public String getBook() {
        System.out.println("springboot is running...");
        return "springboot is running...";
    }

}
