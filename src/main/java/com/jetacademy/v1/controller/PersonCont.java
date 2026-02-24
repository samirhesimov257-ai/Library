package com.jetacademy.v1.controller;

import com.jetacademy.v1.dto.request.PaymentReqDto;
import com.jetacademy.v1.dto.request.PersonReqDto;
import com.jetacademy.v1.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonCont {
    private final PersonService service ;

    @PostMapping
    public void addPerson(@RequestBody PersonReqDto dto){
        service.savePerson(dto);
    }
    @PostMapping("/sendMoney")
    public void sendMoney(@RequestBody PaymentReqDto dto){
        service.sendMoney(dto);
    }


}
