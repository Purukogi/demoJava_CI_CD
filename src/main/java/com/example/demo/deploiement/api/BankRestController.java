package com.example.demo.deploiement.api;

import com.example.demo.deploiement.service.BanqueService;
import com.example.demo.deploiement.service.DebitRequestDTO;
import com.example.demo.deploiement.service.ServiceResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @Autowired
    BanqueService banqueService;

    @PostMapping("/debit")
    public ServiceResponseDTO debit(@RequestBody DebitRequestDTO debitRequestDTO){

        return banqueService.debit(debitRequestDTO.amount);
    }

}
