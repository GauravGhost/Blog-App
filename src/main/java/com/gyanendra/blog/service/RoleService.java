package com.gyanendra.blog.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.gyanendra.blog.entity.Role;
import com.gyanendra.blog.repository.RoleRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
// @AllArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    /**
     * Get role by id
     *
     * @param roleId as String
     * @return Role
     */
    public Role getRoleByRoleId(Long roleId) {
        return roleRepository.getRoleByRoleId(roleId);
    }

    /**
     * Get role by name
     *
     * @param name as String
     * @return Role
     */
    public Role getRoleByName(String name) {
        return roleRepository.getRoleByName(name);
    }

    /**
     * Save Role
     *
     * @param role as Role
     * @return Role
     */
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    /**
     * delete role
     *
     * @param roleId as String
     * @return void
     */
    public void deleteRoleById(Long roleId) {
        roleRepository.deleteById(roleId);
    }
}
