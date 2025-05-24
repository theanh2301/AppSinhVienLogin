package com.company.account_service.mapper;

import com.company.account_service.dto.request.PermissionRequest;
import com.company.account_service.dto.response.PermissionResponse;
import com.company.account_service.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
