package com.example.dashboard.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long userId;
    private String username;
    private String email;
    private String password;
    private String profileImageUrl;
    private String provider;
    private String providerId;
    private LocalDateTime createdAt;
}