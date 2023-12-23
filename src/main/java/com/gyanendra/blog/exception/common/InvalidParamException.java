package com.gyanendra.blog.exception.common;

import static com.gyanendra.blog.util.Constants.Exception.Common.INVALID_PARAM;
import static com.gyanendra.blog.util.Constants.Exception.Common.INVALID_PARAM_CODE;

import org.springframework.http.HttpStatus;

import com.gyanendra.blog.exception.core.BlogException;


public class InvalidParamException extends BlogException {

    //region
    private static final long serialVersionUID = 1L;
    //endregion

    public InvalidParamException() {
        super();
        this.code = INVALID_PARAM_CODE;
        this.msg = INVALID_PARAM;
        this.status = HttpStatus.BAD_REQUEST;
    }
}