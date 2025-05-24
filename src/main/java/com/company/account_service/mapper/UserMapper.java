package com.company.account_service.mapper;

import com.company.account_service.dto.request.UserCreationRequest;
import com.company.account_service.dto.request.UserUpdateRequest;
import com.company.account_service.dto.response.UserResponse;
import com.company.account_service.entity.User;
import com.company.account_service.enums.Role;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest user);

    //@Mapping(source = "", target = ""): to mapping 2 object have difference property
    //@Mapping(target = "", ignore = true): to not mapping anything
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user,UserUpdateRequest request);

    /*default Set<Role> map(List<String> roles) {
        if (roles == null) return new HashSet<>();
        return roles.stream()
                .map(Role::valueOf)
                .collect(Collectors.toSet());
    }*/

}
