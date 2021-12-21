package com.qinfagroup.platform.common.restful;

import com.qinfagroup.platform.common.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 * @author peng.zhao
 */
@Slf4j
@RestControllerAdvice
public class RestfulExceptionHandler {

    /**
     * 默认的全局异常处理方法
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseData<String> exceptionHandle(Exception e) {
        log.error("全局异常信息 ex={}", e.getMessage(), e);
        return ResponseData.failure(ResponseCode.RC500.getCode(), e.getMessage());
    }

    /**
     * 默认的业务异常处理方法
     */
    @ExceptionHandler(ServiceException.class)
    public ResponseData<String> serviceExceptionHandle(ServiceException e) {
        log.error("业务异常信息 ex={}", e.getMessage(), e);
        return ResponseData.failure(e.getCode(), e.getMessage());
    }

}