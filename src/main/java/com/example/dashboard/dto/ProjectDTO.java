package com.example.dashboard.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDTO {
    private Long projectId;
    private Long userId;
    private String title;
    private String description;
    private String repoUrl;
    private String deployedUrl;
    private LocalDateTime createdAt;
}