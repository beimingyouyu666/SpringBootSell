package com.yangk.sell.service.impl;

import com.yangk.sell.mapper.CountryMapper;
import com.yangk.sell.model.Country;
import com.yangk.sell.service.ICountryService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@Slf4j
public class CountryServiceImpl implements ICountryService {

    private static Logger logger = LoggerFactory.getLogger("AccessLog");

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public Country queryCountryByCode(String code) {
        logger.info("test access log and body is: {}",code);
        log.info("test info log and body is: {}",code);
        log.error("test error log and body is: {}",code);
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
