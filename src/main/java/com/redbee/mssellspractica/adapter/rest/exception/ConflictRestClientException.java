package com.redbee.mssellspractica.adapter.rest.exception;


import com.redbee.mssellspractica.config.ErrorCode;
import com.redbee.mssellspractica.config.GenericException;

public class ConflictRestClientException extends GenericException {
    public ConflictRestClientException(ErrorCode ec) {
        super(ec);
    }
}
