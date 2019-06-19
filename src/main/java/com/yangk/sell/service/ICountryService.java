package com.yangk.sell.service;

import com.yangk.sell.model.Country;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/6/19
 * @Version 1.0
 */
@Service
public interface ICountryService {

    Country queryCountryByCode(String code);
}
