package com.example.dashboard.dto;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 결제 정보를 담는 DTO 클래스
 * Lombok의 @Getter, @Setter, @Builder 등을 사용하여 코드를 간소화
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDTO {
    private Long paymentId; // 결제 고유 ID
    private Long userId; // 사용자 ID
    private String impUid; // 아임포트 결제 고유 번호
    private String merchantUid; // 상점에서 생성한 주문 번호
    private BigDecimal amount; // 결제 금액
    private String status; // 결제 상태 (paid, cancelled 등)
    private LocalDateTime paidAt; // 결제 완료 시간
    private LocalDateTime createdAt; // 결제 정보 생성 시간
}