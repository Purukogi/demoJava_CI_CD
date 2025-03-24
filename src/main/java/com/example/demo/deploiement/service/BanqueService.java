package com.example.demo.deploiement.service;

import org.springframework.stereotype.Service;


@Service
public class BanqueService {

    /**
     * RE-123456 code foncionalite
     * @param amount
     * @return
     */
    public ServiceResponseDTO<Float> debit(float amount){
        //2300€

        if (amount > 2300){
            return ServiceResponseDTO.buildResponse("789", "solde insufisant");
        }

        return ServiceResponseDTO.buildResponseWithData("207", "prelevement effectue avec succes", 2300 - amount);

    }

}
