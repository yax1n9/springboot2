package com.yaxing.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yaxing.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yx
 * @date 2022/12/2
 */
@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void testInsert() {
        Book book = new Book();
        book.setName("testBookName");
        book.setType("testBookType");
        book.setDescription("testBookDescription");
        bookDao.insert(book);
    }

    @Test
    public void testDeleteById() {
        bookDao.deleteById(22);
    }

    @Test
    public void testUpdate() {
        Book book = new Book();
        book.setId(22);
        book.setName("testBookNameUpdate");
        bookDao.updateById(book);
    }

    @Test
    public void testSelectById() {
        bookDao.selectById(1);
    }

    @Test
    public void testSelectAll() {
        bookDao.selectList(null);
    }

    @Test
    public void testSelectPage() {
        IPage<Book> iPage = new Page<>(1, 5);
        bookDao.selectPage(iPage, null);
        // 需要配置拦截器触发分页查询  com.yaxing.config.MPConfig

        // 数据总量
        System.out.println("total:  " + iPage.getTotal());
        // 页容量
        System.out.println("size:  " + iPage.getSize());
        // 当前页码
        System.out.println("current:  " + iPage.getCurrent());
        // 总页数
        System.out.println("pages:  " + iPage.getPages());
        // 当前页数据
        System.out.println("records:  " + iPage.getRecords());
    }


    @Test
    public void testSelectByCondition() {
        String name = "设计";
        LambdaQueryWrapper<Book> lqm = new LambdaQueryWrapper<>();
        lqm.like(name != null, Book::getName, name);
        bookDao.selectList(lqm);
    }

    @Test
    public void testSelectByConditionPage() {
        String name = "设计";
        LambdaQueryWrapper<Book> lqm = new LambdaQueryWrapper<>();
        lqm.like(name != null, Book::getName, name);
        IPage<Book> iPage = new Page<>(1, 5);
        bookDao.selectPage(iPage, lqm);
    }
}
