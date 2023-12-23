package com.gyanendra.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyanendra.blog.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * SQL query: SELECT * FROM users WHERE userId = ?
     *
     * @param id as String
     * @return User
     */
    User getUserByUserId(Long id);
    User getUserByUsername(String username);
}