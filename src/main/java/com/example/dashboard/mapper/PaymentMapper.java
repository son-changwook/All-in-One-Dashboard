package com.example.dashboard.mapper;

import com.example.dashboard.dto.PaymentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PaymentMapper {
    // 결제 정보 생성
    void insertPayment(PaymentDTO payment);

    // 결제 정보 조회
    Optional<PaymentDTO> findById(@Param("paymentId") Long paymentId);

    Optional<PaymentDTO> findByImpUid(@Param("impUid") String impUid);

    Optional<PaymentDTO> findByMerchantUid(@Param("merchantUid") String merchantUid);

    List<PaymentDTO> findByUserId(@Param("userId") Long userId);

    List<PaymentDTO> findByStatus(@Param("status") String status);

    // 결제 정보 목록 조회
    List<PaymentDTO> findAll();

    // 결제 정보 수정
    void updatePayment(PaymentDTO payment);

    // 결제 정보 삭제
    void deletePayment(@Param("paymentId") Long paymentId);
}