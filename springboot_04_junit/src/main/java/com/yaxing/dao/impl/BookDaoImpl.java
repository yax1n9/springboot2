package com.yaxing.dao.impl;

import com.yaxing.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author yx
 * @date 2022/12/1
 */
// 生成 bean 交给 spring 管理
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save is running...");
    }
}
