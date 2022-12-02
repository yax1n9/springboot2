package com.yaxing.dao;

import com.yaxing.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author yx
 * @date 2022/12/2
 */
@Mapper
public interface BookDao {
    @Select("select * from ssm_db.tb_books where id=#{id}")
    public Book getBookById(Integer id);
}
