package com.example.demo.deploiement.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ServiceResponseDTO<T> {

    public String code;
    public String message;
    public T data;

    public static <T> ServiceResponseDTO<T> performResponse(ServiceResponseDTO<T> responseDTO){
        Logger logger = LoggerFactory.getLogger(ServiceResponseDTO.class);
        logger.info(String.format("code : %s - Message : %s%n", responseDTO.code, responseDTO.message));
        return responseDTO;
    }

    public static <T> ServiceResponseDTO<T> buildResponseWithData(String code, String message, T data){
        ServiceResponseDTO<T> responseDTO = new ServiceResponseDTO<T>();
        responseDTO.code = code;
        responseDTO.message = message;
        responseDTO.data = data;

        return performResponse(responseDTO);
    }

    public static <T> ServiceResponseDTO<T> buildResponse(String code, String message){
          return buildResponseWithData(code, message, null);
    }

}
