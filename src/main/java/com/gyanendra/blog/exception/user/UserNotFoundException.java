package com.gyanendra.blog.exception.user;

import static com.gyanendra.blog.util.Constants.Exception.User.USER_NOT_FOUND;
import static com.gyanendra.blog.util.Constants.Exception.User.USER_NOT_FOUND_CODE;

import org.springframework.http.HttpStatus;

import com.gyanendra.blog.exception.core.BlogException;

public class UserNotFoundException extends BlogException {

    //region
    private static final long serialVersionUID = 1L;
    //endregion

    public UserNotFoundException() {
        super();
        this.code = USER_NOT_FOUND_CODE;
        this.msg = USER_NOT_FOUND;
        this.status = HttpStatus.NOT_FOUND;
    }
}