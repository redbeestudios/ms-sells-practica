package com.redbee.mssellspractica.adapter.rest.exception;


import com.redbee.mssellspractica.config.ErrorCode;
import com.redbee.mssellspractica.config.GenericException;

public final class EmptyOrNullBodyRestClientException extends GenericException {

    public EmptyOrNullBodyRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
