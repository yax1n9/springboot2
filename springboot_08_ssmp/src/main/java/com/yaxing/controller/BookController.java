package com.yaxing.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yaxing.controller.utils.Result;
import com.yaxing.controller.utils.ResultMsg;
import com.yaxing.domain.Book;
import com.yaxing.service.MPBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


/**
 * @author yx
 * @date 2022/12/3
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private MPBookService bookService;

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        return new Result(true, bookService.getById(id), ResultMsg.SELECT_SUCCESS_MSG);
    }

    @GetMapping
    public Result getAll() throws Exception {
        if (true) throw new IOException();  // 模拟抛出一个异常
        return new Result(true, bookService.list(), ResultMsg.SELECT_SUCCESS_MSG);
    }

    @GetMapping("/{currentPage}/{size}")
    public Result getPage(@PathVariable Integer currentPage, @PathVariable Integer size) {
        IPage<Book> page = new Page<>(currentPage, size);
        return new Result(true, bookService.page(page, null), ResultMsg.SELECT_SUCCESS_MSG);
    }

    @PostMapping
    public Result insert(@RequestBody Book book) {
        Boolean success = bookService.save(book);
        return new Result(success, success ? ResultMsg.ADD_SUCCESS_MSG : ResultMsg.ADD_FAILED_MSG);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        Boolean success = bookService.removeById(id);
        return new Result(success, success ? ResultMsg.REMOVE_SUCCESS_MSG : ResultMsg.REMOVE_FAILED_MSG);
    }

    @PutMapping
    public Result modifyById(@RequestBody Book book) {
        boolean success = bookService.updateById(book);
        return new Result(success, success ? ResultMsg.MODIFY_SUCCESS_MSG : ResultMsg.MODIFY_FAILED_MSG);
    }
}
