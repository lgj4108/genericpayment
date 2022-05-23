package com.example.prototype.payment.pg.dto;

import com.example.prototype.payment.dto.PaymentResultDto;
import com.example.prototype.payment.pg.response.InicisResponse;

public interface DtoBase {
    public <T> PaymentResultDto getResult(T t);

    PaymentResultDto getResult(InicisResponse t);
}
