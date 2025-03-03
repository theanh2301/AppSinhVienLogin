package com.company.account_service.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults (level = AccessLevel.PRIVATE)
public class UserResponse {
    String id;
    String username;
    String firstName;
    String lastName;
    String email;
    Integer phone;
    LocalDate birthDate;
    Set<String> role;
}
