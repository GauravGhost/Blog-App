package com.gyanendra.blog.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyanendra.blog.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * SQL query: SELECT * FROM users WHERE userId = ?
     *
     * @param id as String
     * @return User
     */
    User getUserByUserId(Long id);

    /**
     * SQL query: SELECT * FROM users WHERE username = ?
     *
     * @param username as String
     * @return User
     */
    User getUserByUsername(String username);

}