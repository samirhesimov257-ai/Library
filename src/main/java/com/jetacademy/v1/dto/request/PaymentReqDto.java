package com.jetacademy.v1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaymentReqDto {
    private String senderCardNum;
    private String receiverCardNum;
    private Double sendAmount;


}
