package com.example.prototype.order.dto;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

@Data
public class OrderDto {
    private String orderTypeCode;
    private String orderSystemCode;
    private JsonNode paymentInfo;
}
