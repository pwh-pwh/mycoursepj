package com.coderpwh.business.controller;

import com.coderpwh.server.dto.ResponseDto;
import com.coderpwh.server.exception.ValidatorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(ValidatorException.class)
    public ResponseDto validatorExceptionHandler(ValidatorException e) {
        ResponseDto<Object> objectResponseDto = new ResponseDto<>();
        objectResponseDto.setSuccess(false);
        //打印错误日志
        log.warn("error:", e.getMessage());
        //不返回详细错误信息
        objectResponseDto.setMessage("请求参数异常");
        return objectResponseDto;
    }
}
