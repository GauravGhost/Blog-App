package com.gyanendra.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

import static com.gyanendra.blog.util.Constants.UserPaths.USER_PATH;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gyanendra.blog.entity.User;
import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.facade.UserFacade;
import com.gyanendra.blog.model.common.ResponseHandler;
import com.gyanendra.blog.model.user.UserModel;
import com.gyanendra.blog.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping(USER_PATH)
@Api(value = USER_PATH, tags = "User APIs")
public class UserController {

    private final UserFacade facade;
    private final UserService userService;

    /**
     * Save user
     *
     * @param model as UserModel
     * @return User
     * @throws BlogException as BlogException
     */
    @PostMapping
    @ApiOperation(value = "Save User", response = User.class)
    public ResponseEntity<Object> saveUser(@RequestBody UserModel model) throws BlogException {
        return ResponseHandler.response(HttpStatus.OK, facade.saveUser(model), true);
    }

    /**
     * Get user by id
     *
     * @param userId as String
     * @return User
     * @throws BlogException as BlogException
     */
    @GetMapping("/{userId}")
    @ApiOperation(value = "Get User", response = User.class)
    public ResponseEntity<Object> getUser(@PathVariable Long userId) throws BlogException {
        return ResponseHandler.response(HttpStatus.OK, facade.getUserById(userId), true);
    }

    /**
     * Get All User
     *
     * @return User
     * @throws BlogException as BlogException
     */
    @GetMapping
    @ApiOperation(value = "Get All User", response = User.class)
    public ResponseEntity<Object> getAllUser() throws BlogException {
        return ResponseHandler.response(HttpStatus.OK, userService.getAll(), true);
    }

    /**
     * Delete User By Id
     *
     * @param userId as Long
     * @return null
     * @throws BlogException as BlogException
     */
    @DeleteMapping("/{userId}")
    @ApiOperation(value = "Delete User By Id", response = User.class)
    public ResponseEntity<Object> deleteUserById(@PathVariable Long userId) throws BlogException {
        facade.deleteUserById(userId);
        return ResponseHandler.response(HttpStatus.OK, null, true);
    }
}
