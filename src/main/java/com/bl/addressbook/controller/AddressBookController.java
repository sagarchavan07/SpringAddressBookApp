package com.bl.addressbook.controller;

import com.bl.addressbook.dto.ResponseDTO;
import com.bl.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    @GetMapping(value = {"","/"})
    public ResponseEntity<ResponseDTO> hello(){
        return addressBookService.welcomeMessage();
    }
}
