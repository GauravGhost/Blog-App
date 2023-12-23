package com.gyanendra.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import static com.gyanendra.blog.util.Constants.RolePath.ROLE_PATH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gyanendra.blog.entity.Role;
import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.facade.RoleFacade;
import com.gyanendra.blog.model.common.ResponseHandler;
import com.gyanendra.blog.model.role.RoleModel;

@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping(ROLE_PATH)
@Api(value = ROLE_PATH, tags = "ROLE APIs")
public class RoleController {
    @Autowired
    private RoleFacade roleFacade;

    /**
     * Get role By Id
     *
     * @param model as roleModel
     * @return Role
     * @throws BlogException
     */
    @GetMapping("/{roleId}")
    @ApiOperation(value = "Get Role By Id", response = Role.class)
    public ResponseEntity<Object> getRoleById(@PathVariable("roleId") Long roleId) throws BlogException {
        return ResponseHandler.response(HttpStatus.OK, roleFacade.getRoleById(roleId), true);
    }

    /**
     * Save user
     *
     * @param model as roleModel
     * @return Role
     * @throws BlogException
     */
    @PostMapping
    @ApiOperation(value = "Save Role", response = Role.class)
    public ResponseEntity<Object> saveUser(@RequestBody RoleModel model) throws BlogException {
        return ResponseHandler.response(HttpStatus.OK, roleFacade.saveRole(model), true);
    }
}
