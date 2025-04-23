package com.example.dashboard.mapper;

import com.example.dashboard.dto.ProjectDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProjectMapper {
    // 프로젝트 생성
    void insertProject(ProjectDTO project);

    // 프로젝트 조회
    Optional<ProjectDTO> findById(@Param("projectId") Long projectId);

    List<ProjectDTO> findByUserId(@Param("userId") Long userId);

    // 프로젝트 목록 조회
    List<ProjectDTO> findAll();

    // 프로젝트 정보 수정
    void updateProject(ProjectDTO project);

    // 프로젝트 삭제
    void deleteProject(@Param("projectId") Long projectId);
}