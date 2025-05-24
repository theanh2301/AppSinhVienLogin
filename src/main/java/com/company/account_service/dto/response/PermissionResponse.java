package com.company.account_service.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults (level = AccessLevel.PRIVATE)
public class PermissionResponse {
    String name;
    String description;
}
