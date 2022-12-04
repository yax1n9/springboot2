package com.yaxing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yaxing.dao.BookDao;
import com.yaxing.domain.Book;
import com.yaxing.service.MPBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2022/12/3
 */
@Service
public class MPBookServiceImpl extends ServiceImpl<BookDao, Book> implements MPBookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer size, Book book) {
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();

        lqw.like(book.getName() != null, Book::getName, book.getName());
        lqw.like(book.getType() != null, Book::getType, book.getType());
        lqw.like(book.getDescription() != null, Book::getDescription, book.getDescription());

        IPage<Book> page = new Page<Book>(currentPage, size);
        return bookDao.selectPage(page, lqw);
    }
}
