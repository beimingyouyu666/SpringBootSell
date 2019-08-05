package com.yangk.sell;

import com.yangk.sell.mapper.CountryMapper;
import com.yangk.sell.mapper.StudentMapper;
import com.yangk.sell.model.Country;
import com.yangk.sell.model.Student;
import com.yangk.sell.service.ICountryService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Data
@Slf4j
@ComponentScan(basePackages = {"com.yangk"})
@MapperScan(basePackages = "com.yangk.sell.mapper")
public class SellApplicationTests {


    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private ICountryService iCountryService;

    @Autowired
    private StudentMapper studentMapper;


    /**
     *  测试日志
     */
    @Test
    public void testDao(){
        Country country = iCountryService.queryCountryByCode("101");
//        Country country = countryMapper.queryCountryByCode("101");
        System.out.println(country);
    }

    @Test
    public void testLog(){
        log.info("error",new NullPointerException());
        throw new NullPointerException();
    }

    @Test
    public void testCountry(){
        List<Country> countries = countryMapper.selectAll();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    @Test
    public void testCountryByCode(){
        iCountryService.queryCountryByCondition("101");
    }

    @Test
    public void testStudent(){
        List<Student> students = studentMapper.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
