package com.gyanendra.blog.service;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.gyanendra.blog.entity.Role;
import com.gyanendra.blog.entity.User;
import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.repository.RoleRepository;
import com.gyanendra.blog.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    // region
    private final UserRepository repository;
    private final RoleRepository roleRepository;
    // endregion

    /**
     * Get user by id
     *
     * @param userId as String
     * @return User
     */
    public User getUserById(Long userId) {
        return repository.getUserByUserId(userId);
    }

    /**
     * Get user by username
     *
     * @param userId as String
     * @return User
     */
    public User getUserByUsername(String username) {
        return repository.getUserByUsername(username);
    }

    /**
     * Get All user
     *
     * @return List<User>
     */
    public List<User> getAll() {
        return repository.findAll();
    }

    /**
     * Save user
     *
     * @param user as User
     * @return User
     */
    public User saveUser(User user) {
        // set user's fields from userDto...

        Set<Role> roles = new HashSet<>();
        for (Role role : user.getRoles()) {
            Role roleData = roleRepository.getRoleByName(role.getName());
            if (roleData != null) {
                roles.add(roleData);
            }
        }
        // System.out.println(null);
        user.setRoles(roles);
        return repository.save(user);
    }

    /**
     * delete user
     *
     * @param userId as String
     * @return void
     */
    public void deleteUser(Long userId) {
        repository.deleteById(userId);
    }

}
