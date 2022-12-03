package com.yaxing.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yaxing.domain.Book;

import java.util.List;

/**
 * @author yx
 * @date 2022/12/3
 */
public interface BookService {
    boolean save(Book book);

    boolean delete(Integer id);

    boolean update(Book book);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getPage(Integer currentPage, Integer size);
}
