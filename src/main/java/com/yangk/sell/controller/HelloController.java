package com.yangk.sell.controller;

import com.yangk.sell.model.Country;
import com.yangk.sell.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/8/5
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private ICountryService iCountryService;

    @RequestMapping("/hello")
    public String hello() throws Exception {
        Country country = iCountryService.queryCountryByCode("101");
        return "hello world";
//        throw new Exception();
    }

}
