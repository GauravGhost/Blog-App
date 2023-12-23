package com.gyanendra.blog.facade;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyanendra.blog.entity.Role;
import com.gyanendra.blog.exception.common.InvalidParamException;
import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.exception.role.RoleAlreadyExistException;
import com.gyanendra.blog.exception.role.RoleNotFoundException;
import com.gyanendra.blog.model.role.RoleModel;
import com.gyanendra.blog.service.RoleService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleFacade {
    private final RoleService roleService;

    /**
     * Get Role by id
     *
     * @param roleId as Long
     * @return Role with User Associated with this role
     * @throws BlogException
     */
    public Object getRoleById(Long roleId) throws BlogException {
        // Checking params
        if (roleId < 0)
            throw new InvalidParamException();
        // Checking role
        Role role = roleService.getRoleByRoleId(roleId);
        if (role == null)
            throw new RoleNotFoundException();
        return role;
    }

    /**
     * Save role
     *
     * @param model as roleModel
     * @return Role
     * @throws BlogException
     */
    public Object saveRole(RoleModel model) throws BlogException {
        // Checking params
        if (model == null || model.getName().isEmpty()) {
            throw new InvalidParamException();
        }
        // Checking if role is already exist
        Role existRole = roleService.getRoleByName(model.getName());
        if (existRole != null) {
            throw new RoleAlreadyExistException();

        }
        // Mapping model RoleModel -> Role
        Role role = new ModelMapper().map(model, Role.class);
        return roleService.saveRole(role);
    }
}
