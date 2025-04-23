package com.example.dashboard.mapper;

import com.example.dashboard.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    // 사용자 생성
    void insertUser(UserDTO user);

    // 사용자 조회
    Optional<UserDTO> findById(@Param("userId") Long userId);

    Optional<UserDTO> findByEmail(@Param("email") String email);

    Optional<UserDTO> findByProviderAndProviderId(@Param("provider") String provider,
            @Param("providerId") String providerId);

    // 사용자 목록 조회
    List<UserDTO> findAll();

    // 사용자 정보 수정
    void updateUser(UserDTO user);

    // 사용자 삭제
    void deleteUser(@Param("userId") Long userId);
}