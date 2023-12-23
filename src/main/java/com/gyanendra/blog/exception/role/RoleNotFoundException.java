package com.gyanendra.blog.exception.role;

import org.springframework.http.HttpStatus;

import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.util.Constants.Exception.Role;

public class RoleNotFoundException extends BlogException {
    public RoleNotFoundException() {
        super();
        this.msg = Role.ROLE_NOT_FOUND;
        this.code = Role.ROLE_NOT_FOUND_CODE;
        this.status = HttpStatus.NOT_FOUND;
    }
}
