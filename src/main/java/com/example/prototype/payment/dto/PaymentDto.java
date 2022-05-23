package com.example.prototype.payment.dto;

import lombok.Data;

import java.util.Map;

@Data
public class PaymentDto {
    private String orderNo;
    private String paymentType;
    private Map<String, Object> payInfo;
}
