package com.gyanendra.blog.exception.user;

import static com.gyanendra.blog.util.Constants.Exception.User.USER_ALREADY_EXIST;
import static com.gyanendra.blog.util.Constants.Exception.User.USER_ALREADY_EXIST_CODE;

import org.springframework.http.HttpStatus;

import com.gyanendra.blog.exception.core.BlogException;

public class UserAlreadyExistException extends BlogException {

    //region
    private static final long serialVersionUID = 1L;
    //endregion

    public UserAlreadyExistException() {
        super();
        this.code = USER_ALREADY_EXIST_CODE;
        this.msg = USER_ALREADY_EXIST;
        this.status = HttpStatus.BAD_REQUEST;
    }
}