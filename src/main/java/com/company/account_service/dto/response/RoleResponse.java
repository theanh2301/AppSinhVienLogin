package com.company.account_service.dto.response;

import com.company.account_service.entity.Permission;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults (level = AccessLevel.PRIVATE)
public class RoleResponse {
    String name;
    String description;
    Set<Permission> permissions;
}
