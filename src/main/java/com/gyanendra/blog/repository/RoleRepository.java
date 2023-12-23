package com.gyanendra.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyanendra.blog.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role getRoleByRoleId(Long roleId);

    Role getRoleByName(String name);
}
