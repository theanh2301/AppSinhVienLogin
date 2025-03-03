package com.company.account_service.mapper;

import com.company.account_service.dto.request.UserCreationRequest;
import com.company.account_service.dto.request.UserUpdateRequest;
import com.company.account_service.dto.response.UserResponse;
import com.company.account_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest user);

    //@Mapping(source = "", target = ""): to mapping 2 object have difference property
    //@Mapping(target = "", ignore = true): to not mapping anything
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user,UserUpdateRequest request);
}
