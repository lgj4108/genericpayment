package com.example.prototype.payment.pg.response;

import com.example.prototype.payment.dto.PaymentResultDto;
import com.example.prototype.payment.pg.dto.ResponseDto;
import lombok.Data;

@Data
public class InicisResponse extends ResponseDto {

    private String resultCode;
    private String resultMsg;
    private String tid;
    private String goodName;
    private String TotPrice;
    private String MOID;
    private String payMethod;

    @Override
    public PaymentResultDto getPayResult() {
        PaymentResultDto result = new PaymentResultDto(this.tid);

        return result;
    }
}
