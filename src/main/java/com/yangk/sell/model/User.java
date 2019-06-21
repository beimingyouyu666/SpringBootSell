package com.yangk.sell.model;

import lombok.Data;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/6/21
 * @Version 1.0
 */
@Data
public class User {

    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别 1=男 2=女 其他=保密
     */
    private Integer sex;

}
