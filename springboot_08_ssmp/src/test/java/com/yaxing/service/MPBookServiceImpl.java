package com.yaxing.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yaxing.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yx
 * @date 2022/12/3
 */
@SpringBootTest
public class MPBookServiceImpl {

    @Autowired
    private MPBookService mpBookService;

    @Test
    public void testSave() {
        Book book = new Book();
        book.setName("testServiceName");
        book.setType("testServiceType");
        book.setDescription("testServiceDescription");

        mpBookService.save(book);
    }

    @Test
    public void testDelete() {
        mpBookService.removeById(13);
    }

    @Test
    public void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setName("testServiceNameUpdate");
        // book.setType("testServiceType");
        // book.setDescription("testServiceDescription");
        mpBookService.updateById(book);
    }

    @Test
    public void testGetById() {
        mpBookService.getById(8);
    }

    @Test
    public void testGetAll() {
        mpBookService.list();
    }

    @Test
    public void testGetPage() {
        IPage<Book> page = new Page<>(2, 5);
        mpBookService.page(page, null);
    }
}
