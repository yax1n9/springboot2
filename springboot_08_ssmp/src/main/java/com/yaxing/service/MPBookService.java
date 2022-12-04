package com.yaxing.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.glass.ui.Size;
import com.yaxing.domain.Book;

/**
 * @author yx
 * @date 2022/12/3
 */
public interface MPBookService extends IService<Book> {
    IPage<Book> getPage(Integer currentPage, Integer size, Book book);
}
