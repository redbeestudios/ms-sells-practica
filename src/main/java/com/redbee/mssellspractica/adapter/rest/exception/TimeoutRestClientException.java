package com.redbee.mssellspractica.adapter.rest.exception;


import com.redbee.mssellspractica.config.ErrorCode;
import com.redbee.mssellspractica.config.GenericException;

public final class TimeoutRestClientException extends GenericException {

    public TimeoutRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
