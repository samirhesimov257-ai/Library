package com.jetacademy.v1.service;

import com.jetacademy.v1.dao.entity.PersonEnt;
import com.jetacademy.v1.dao.repository.PersonRepo;
import com.jetacademy.v1.dto.request.PaymentReqDto;
import com.jetacademy.v1.dto.request.PersonReqDto;
import com.jetacademy.v1.mapper.PersonMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepo repo;
    private final PersonMapper mapper;


    public void savePerson(PersonReqDto dto) {
        if (dto.getAge() < 18) {
            throw new RuntimeException("Balacasan");
        } else {
            repo.save(mapper.toEntity(dto));
        }
    }


    @Transactional
    public void sendMoney(PaymentReqDto dto){
        sender(dto);
        receiver(dto);
    }


    private void  sender(PaymentReqDto dto) {
        PersonEnt sender= repo.findByCardNumber(dto.getSenderCardNum()).orElseThrow(
                ()->new RuntimeException("sender person not found")
        );
        if (sender.getBalance() < dto.getSendAmount()) throw new  RuntimeException("Balance nor enough");
        sender.setBalance(sender.getBalance() - dto.getSendAmount());
        repo.save(sender);
    }

    private void receiver(PaymentReqDto dto){
        PersonEnt receiver= repo.findByCardNumber(dto.getReceiverCardNum()).orElseThrow(
                ()->new RuntimeException("receiver not found")
        );
        receiver.setBalance(receiver.getBalance() + dto.getSendAmount());
        repo.save(receiver);
    }


}
