package com.yaxing.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yaxing.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yx
 * @date 2022/12/3
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testSave() {
        Book book = new Book();
        book.setName("testServiceName");
        book.setType("testServiceType");
        book.setDescription("testServiceDescription");

        bookService.save(book);
    }

    @Test
    public void testDelete() {
        bookService.delete(12);
    }

    @Test
    public void testUpdate() {
        Book book = new Book();
        book.setId(12);
        book.setName("testServiceNameUpdate");
        // book.setType("testServiceType");
        // book.setDescription("testServiceDescription");
        bookService.update(book);
    }

    @Test
    public void testGetById() {
        bookService.getById(5);
    }

    @Test
    public void testGetAll() {
        bookService.getAll();
    }

    @Test
    public void testGetPage() {
        bookService.getPage(2, 5);
    }
}
