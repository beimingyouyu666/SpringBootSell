package com.yangk.sell;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Data
@Slf4j
public class SellApplicationTests {

    @Test
    public void contextLoads() {
        for (int i=0;i<100;i++){
            log.info("log info------------------------------------------------------");
            log.error("log error---------------------------------------------------------");
        }

    }

}
