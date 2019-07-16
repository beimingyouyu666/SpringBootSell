package com.yangk.sell.mapper;

import com.yangk.sell.model.Country;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/6/19
 * @Version 1.0
 */
public interface CountryMapper extends Mapper<Country> {

    Country queryCountryByCode(String code);

}
