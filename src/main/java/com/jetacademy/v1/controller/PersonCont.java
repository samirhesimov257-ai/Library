package com.jetacademy.v1.controller;

import com.jetacademy.v1.dto.request.PaymentReqDto;
import com.jetacademy.v1.dto.request.PersonReqDto;
import com.jetacademy.v1.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonCont {
    private final PersonService service ;

    @PostMapping
    public void addPerson(@RequestBody PersonReqDto dto){
        service.savePerson(dto);
    }
    @PatchMapping("/sendMoney")
    public void sendMoney(@RequestBody PaymentReqDto dto){
        service.sendMoney(dto);
    }


}
