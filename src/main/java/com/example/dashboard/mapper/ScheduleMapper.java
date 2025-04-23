package com.example.dashboard.mapper;

import com.example.dashboard.dto.ScheduleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Mapper
public interface ScheduleMapper {
    // 일정 생성
    void insertSchedule(ScheduleDTO schedule);

    // 일정 조회
    Optional<ScheduleDTO> findById(@Param("scheduleId") Long scheduleId);

    List<ScheduleDTO> findByUserId(@Param("userId") Long userId);

    List<ScheduleDTO> findByDateRange(
            @Param("userId") Long userId,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate);

    // 일정 목록 조회
    List<ScheduleDTO> findAll();

    // 일정 정보 수정
    void updateSchedule(ScheduleDTO schedule);

    // 일정 삭제
    void deleteSchedule(@Param("scheduleId") Long scheduleId);
}