package com.gyanendra.blog.exception.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BlogException extends Exception {
    protected String code;
    protected String msg;
    protected String stack;
    protected HttpStatus status;
}