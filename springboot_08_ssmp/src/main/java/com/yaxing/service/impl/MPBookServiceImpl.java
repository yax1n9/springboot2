package com.yaxing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yaxing.dao.BookDao;
import com.yaxing.domain.Book;
import com.yaxing.service.MPBookService;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2022/12/3
 */
@Service
public class MPBookServiceImpl extends ServiceImpl<BookDao, Book> implements MPBookService {
}
