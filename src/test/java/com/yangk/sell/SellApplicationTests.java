package com.yangk.sell;

import com.yangk.sell.mapper.CountryMapper;
import com.yangk.sell.model.Country;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Data
@Slf4j
@ComponentScan(basePackages = {"com.yangk"})
@MapperScan("com.yangk.sell.mapper")
public class SellApplicationTests {

    @Autowired
    private CountryMapper countryMapper;
//    private ICountryService iCountryService;

    @Test
    public void contextLoads() {
        for (int i=0;i<10;i++){
            log.info("log info------------------------------------------------------");
            log.error("log error---------------------------------------------------------");
        }
    }

    @Test
    public void testDao(){
//        Country country = iCountryService.queryCountryByCode("101");
        Country country = countryMapper.queryCountryByCode("101");
        System.out.println(111);
    }

}
