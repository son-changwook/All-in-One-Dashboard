package com.example.dashboard.mapper;

import com.example.dashboard.dto.FileDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface FileMapper {
    // 파일 정보 생성
    void insertFile(FileDTO file);

    // 파일 정보 조회
    Optional<FileDTO> findById(@Param("fileId") Long fileId);

    List<FileDTO> findByUserId(@Param("userId") Long userId);

    List<FileDTO> findByFileType(@Param("fileType") String fileType);

    // 파일 정보 목록 조회
    List<FileDTO> findAll();

    // 파일 정보 수정
    void updateFile(FileDTO file);

    // 파일 정보 삭제
    void deleteFile(@Param("fileId") Long fileId);
}