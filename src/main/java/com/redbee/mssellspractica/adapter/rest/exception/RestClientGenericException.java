package com.redbee.mssellspractica.adapter.rest.exception;


import com.redbee.mssellspractica.config.ErrorCode;
import com.redbee.mssellspractica.config.GenericException;

public final class RestClientGenericException extends GenericException {

    public RestClientGenericException(ErrorCode errorCode) {
        super(errorCode);
    }

}
