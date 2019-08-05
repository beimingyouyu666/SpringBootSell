package com.yangk.sell.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description 全局异常处理类
 * @Author yangkun
 * @Date 2019/8/5
 * @Version 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger("AccessLog");

    @ExceptionHandler({Exception.class})
    public String handler(Exception e){
        String message = e.getMessage();
        logger.error("-------------GlobalExceptionHandler",e);
        return "hehe";
    }

}
