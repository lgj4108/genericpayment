package com.example.prototype.payment.pg.base;

import com.example.prototype.payment.dto.PaymentDto;
import com.example.prototype.payment.dto.PaymentResultDto;
import com.example.prototype.payment.pg.dto.RequestDto;
import com.example.prototype.payment.pg.dto.ResponseDto;
import com.example.prototype.payment.workinterface.Approve;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractPg<T extends RequestDto<T>, T2 extends ResponseDto> {
    public abstract PaymentResultDto call(PaymentDto dto);
    public T approve(T t, Class<T2> clazz) {
        System.out.println("history");
        // dto -> json parameter 전환
        // api call
        String apiResult = "";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            T2 r = (T2) objectMapper.readValue(apiResult, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return r;
    }
}
