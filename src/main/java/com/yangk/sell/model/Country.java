package com.yangk.sell.model;

import lombok.Data;

import javax.persistence.Id;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/6/19
 * @Version 1.0
 */
@Data
public class Country {

    @Id
    private String id;
    private String countryname;
    private String countrycode;
}
