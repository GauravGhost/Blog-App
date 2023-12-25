package com.gyanendra.blog.service;

import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.exception.role.RoleNotFoundException;
import lombok.RequiredArgsConstructor;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.gyanendra.blog.entity.Role;
import com.gyanendra.blog.entity.User;
import com.gyanendra.blog.repository.RoleRepository;
import com.gyanendra.blog.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    /**
     * Get user by id
     *
     * @param userId as String
     * @return User
     */
    public User getUserById(Long userId) {
        return userRepository.getUserByUserId(userId);
    }

    /**
     * Get user by username
     *
     * @param username as String
     * @return User
     */
    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    /**
     * Get All user
     *
     * @return List<User>
     */
    public List<User> getAll() {
        return userRepository.findAll();
    }

    /**
     * Save user
     *
     * @param user as User
     * @return User
     */
    public User saveUser(User user) throws BlogException {
        // set user's fields from userDto...

        Set<Role> roles = new HashSet<>();
        for (Role role : user.getRoles()) {
            Role roleData = roleRepository.getRoleByName(role.getName());
            System.out.println(roleData);
            if (roleData == null) {
                throw new RoleNotFoundException();
            }
            roles.add(roleData);
        }
        user.setRoles(roles);
        return userRepository.save(user);
    }

    /**
     * delete user
     *
     * @param userId as String
     */
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }

}
