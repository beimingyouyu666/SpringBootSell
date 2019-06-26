package com.yangk.sell.service.impl;

import com.yangk.sell.mapper.CountryMapper;
import com.yangk.sell.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        Function<Integer,Integer> function = i-> {if (i==2){i=8;}
            return i;
        };
        List<Integer> collect = list.stream().map(function).collect(Collectors.toList());
//        List<Integer> collect = list.stream().map(i -> i == 2 ? 8 : i).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
