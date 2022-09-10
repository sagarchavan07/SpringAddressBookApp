package com.bl.addressbook.service;

import com.bl.addressbook.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {

    public ResponseEntity<ResponseDTO> welcomeMessage(){
        ResponseDTO responseDTO = new ResponseDTO("GET call success","Welcome to AddressBook Application");
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
