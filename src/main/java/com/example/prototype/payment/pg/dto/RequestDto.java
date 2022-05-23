package com.example.prototype.payment.pg.dto;

import com.example.prototype.payment.dto.PaymentDto;

public abstract class RequestDto <T> {
    public abstract T getRequest(PaymentDto dto);
}
