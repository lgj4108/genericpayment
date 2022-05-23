package com.example.prototype.payment.workinterface;

import com.example.prototype.payment.dto.PaymentDto;
import com.example.prototype.payment.dto.PaymentResultDto;

public interface Approve<T> {
    PaymentResultDto approve(PaymentDto dto, T t);
}
