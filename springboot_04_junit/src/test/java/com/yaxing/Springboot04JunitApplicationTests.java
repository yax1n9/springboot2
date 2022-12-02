package com.yaxing;

import com.yaxing.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

// 当测试类与启动类不在同一包或启动类的子包下时，使用下面方式其一可以解决
// @SpringBootTest(classes = Springboot04JunitApplicationTests.class)
// @ContextConfiguration(classes = Springboot04JunitApplicationTests.class)
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
