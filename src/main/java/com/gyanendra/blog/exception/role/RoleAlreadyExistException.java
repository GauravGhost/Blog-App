package com.gyanendra.blog.exception.role;

import org.springframework.http.HttpStatus;

import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.util.Constants.Exception.Role;

public class RoleAlreadyExistException extends BlogException{
    public RoleAlreadyExistException(){
        super();
        this.msg = Role.ROLE_ALREADY_EXIST;
        this.code = Role.ROLE_ALREADY_EXIST_CODE;
        this.status = HttpStatus.BAD_REQUEST;
    }
}
