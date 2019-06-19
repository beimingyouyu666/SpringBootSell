package com.yangk.sell.mapper;

import com.yangk.sell.model.Country;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/6/19
 * @Version 1.0
 */
public interface CountryMapper {

    Country queryCountryByCode(String code);

}
