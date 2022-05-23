package com.example.prototype.payment.pg.dto;

import com.example.prototype.payment.dto.PaymentResultDto;

public abstract class ResponseDto {
    public abstract PaymentResultDto getPayResult();
}
