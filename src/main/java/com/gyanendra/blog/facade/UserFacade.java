package com.gyanendra.blog.facade;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.gyanendra.blog.entity.User;
import com.gyanendra.blog.exception.common.InvalidParamException;
import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.exception.user.UserAlreadyExistException;
import com.gyanendra.blog.exception.user.UserNotFoundException;
import com.gyanendra.blog.model.user.UserModel;
import com.gyanendra.blog.service.UserService;

@Service
@RequiredArgsConstructor
public class UserFacade {

    // region
    private final UserService userService;
    // endregion

    /**
     * Get user by id
     *
     * @param userId as String
     * @return User
     * @throws BlogException
     */
    public Object getUserById(Long userId) throws BlogException {
        // Checking user
        User user = userService.getUserById(userId);
        if (user == null)
            throw new UserNotFoundException();
        return user;
    }

    /**
     * Save user
     *
     * @param model as UserModel
     * @return User
     * @throws BlogException
     */
    public Object saveUser(UserModel model) throws BlogException {
        // Checking params
        if (model == null ||
                model.getName().isEmpty() || model.getUsername().isEmpty())
            throw new InvalidParamException();
        // Checking if user is already exist
        User existUser = userService.getUserByUsername(model.getUsername());
        if (existUser != null)
            throw new UserAlreadyExistException();
        // Mapping model UserModel -> User
        User user = new ModelMapper().map(model, User.class);
        return userService.saveUser(user);
    }

    /**
     * Delete user by id
     *
     * @param userId as String
     * @throws BlogException as BlogException
     */
    public void deleteUserById(Long userId) throws BlogException {
        // Checking user
        User user = userService.getUserById(userId);
        if (user == null)
            throw new UserNotFoundException();
        userService.deleteUserById(userId);
    }
}
