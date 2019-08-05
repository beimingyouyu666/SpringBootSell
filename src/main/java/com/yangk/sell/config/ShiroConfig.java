package com.yangk.sell.config;

import com.yangk.sell.util.MyShiroRealm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/7/16
 * @Version 1.0
 */
@Configuration
public class ShiroConfig {

    @Bean
    public MyShiroRealm getMyShiroRealm(){
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        return myShiroRealm;
    }

}
