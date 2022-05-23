package com.example.prototype.payment.pg;

import com.example.prototype.payment.dto.PaymentDto;
import com.example.prototype.payment.dto.PaymentResultDto;
import com.example.prototype.payment.pg.base.AbstractPg;
import com.example.prototype.payment.pg.request.InicisRequest;
import com.example.prototype.payment.pg.response.InicisResponse;
import com.example.prototype.payment.workinterface.Approve;

public class Inicis extends AbstractPg<InicisRequest, InicisResponse> {
    @Override
    public PaymentResultDto call(PaymentDto dto) {
        super.approve(dto, new InicisRequest().getRequest(dto), )
    }
}
