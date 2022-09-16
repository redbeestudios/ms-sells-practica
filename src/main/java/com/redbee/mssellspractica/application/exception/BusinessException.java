package com.redbee.mssellspractica.application.exception;


import com.redbee.mssellspractica.config.ErrorCode;
import com.redbee.mssellspractica.config.GenericException;

public class BusinessException extends GenericException {

    public BusinessException(ErrorCode errorCode){
        super(errorCode);
    }
}
