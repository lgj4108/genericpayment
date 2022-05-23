package com.example.prototype.payment.pg.request;

import com.example.prototype.payment.dto.PaymentDto;
import com.example.prototype.payment.pg.dto.RequestDto;

public class InicisRequest extends RequestDto<InicisRequest> {
    private String test;

    @Override
    public InicisRequest getRequest(PaymentDto dto) {

        return null;
    }
}
