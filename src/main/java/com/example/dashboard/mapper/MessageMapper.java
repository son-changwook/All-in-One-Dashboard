package com.example.dashboard.mapper;

import com.example.dashboard.dto.MessageDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MessageMapper {
    // 메시지 생성
    void insertMessage(MessageDTO message);

    // 메시지 조회
    Optional<MessageDTO> findById(@Param("messageId") Long messageId);

    List<MessageDTO> findBySenderId(@Param("senderId") Long senderId);

    List<MessageDTO> findByReceiverId(@Param("receiverId") Long receiverId);

    List<MessageDTO> findConversation(@Param("userId1") Long userId1, @Param("userId2") Long userId2);

    // 메시지 목록 조회
    List<MessageDTO> findAll();

    // 메시지 삭제
    void deleteMessage(@Param("messageId") Long messageId);
}