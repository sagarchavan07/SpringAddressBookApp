package com.bl.addressbook.exception;

import com.bl.addressbook.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(AddressBookException.class)
    public ResponseEntity<ResponseDTO> handleCustomException(Exception exception) {
        ResponseDTO responseDTO = new ResponseDTO("ERROR! => AddressBookException", exception.getMessage());
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
