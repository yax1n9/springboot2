package com.yaxing.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yx
 * @date 2022/12/2
 */
@Data
@TableName("tb_books")
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
