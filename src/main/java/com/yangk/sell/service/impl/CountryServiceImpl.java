package com.yangk.sell.service.impl;

import com.yangk.sell.mapper.CountryMapper;
import com.yangk.sell.model.Country;
import com.yangk.sell.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/6/19
 * @Version 1.0
 */
@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public Country queryCountryByCode(String code) {
        return countryMapper.queryCountryByCode("101");
    }

    @Override
    public Country queryCountryByCondition(String countryId) {
        Example example = new Example(Country.class);
        example.createCriteria().andEqualTo("id",countryId);
        Country country = countryMapper.selectOneByExample(example);
        return country;
    }
}
