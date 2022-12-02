package com.yaxing.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yaxing.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yx
 * @date 2022/12/2
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
