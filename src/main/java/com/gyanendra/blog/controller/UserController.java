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

    // region
    private final UserFacade facade;
    private final UserService userService;
    // endregion

    /**
     * Save user
     *
     * @param model as UserModel
     * @return User
     * @throws BlogException
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
     * @throws BlogException
     */
    @GetMapping("/{userId}")
    @ApiOperation(value = "Get User", response = User.class)
    public ResponseEntity<Object> getUser(@PathVariable Long userId) throws BlogException {
        return ResponseHandler.response(HttpStatus.OK, facade.getUser(userId), true);
    }

    /**
     * Get user by id
     *
     * @param userId as String
     * @return User
     * @throws BlogException
     */
    @GetMapping
    @ApiOperation(value = "Get All User", response = User.class)
    public ResponseEntity<Object> getAllUser() {
        return ResponseHandler.response(HttpStatus.OK, userService.getAll(), true);
    }
}
