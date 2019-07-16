package com.yangk.sell.service;

import com.yangk.sell.model.Country;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/6/19
 * @Version 1.0
 */
public interface ICountryService {

    Country queryCountryByCode(String code);

    Country queryCountryByCondition(String countryId);
}
