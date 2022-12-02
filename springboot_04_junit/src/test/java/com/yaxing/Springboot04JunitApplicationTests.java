package com.yaxing;

import com.yaxing.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {
    // 1. 导入需要测试的对象
    @Autowired
    private BookDao bookDao;
    // 2. 调用需要测试的方法

    @Test
    void contextLoads() {
        bookDao.save();
    }

}
