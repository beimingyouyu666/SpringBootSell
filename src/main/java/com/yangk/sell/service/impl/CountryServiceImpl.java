package com.yangk.sell.service.impl;

import com.yangk.sell.mapper.CountryMapper;
import com.yangk.sell.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/6/19
 * @Version 1.0
 */
@Service
public class CountryServiceImpl {

    @Autowired
    private CountryMapper countryMapper;

    public Country queryCountryByCode(){
        return countryMapper.queryCountryByCode("101");
    }
}
