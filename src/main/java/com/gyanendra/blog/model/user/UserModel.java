package com.gyanendra.blog.model.user;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.gyanendra.blog.entity.Role;
import com.gyanendra.blog.model.role.RoleModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String name;
    private String username;
    private String  email;
    private String password;
    private Set<Role> roles =  Set.of(new Role("ROLE_USER"));
}
