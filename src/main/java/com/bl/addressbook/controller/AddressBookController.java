package com.bl.addressbook.controller;

import com.bl.addressbook.dto.ContactPersonDTO;
import com.bl.addressbook.dto.ResponseDTO;
import com.bl.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookapp")
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    @GetMapping(value = {"","/"})
    public ResponseEntity<ResponseDTO> hello(){
        return addressBookService.welcomeMessage();
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getPersonById(@PathVariable Long personId){
        return addressBookService.getPersonById(personId);
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addContact(@RequestBody ContactPersonDTO contactPersonDTO){
        return addressBookService.addContact(contactPersonDTO);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateContact(@PathVariable long id ,@RequestBody ContactPersonDTO contactPersonDTO){
        return addressBookService.updateById(id, contactPersonDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteContactById(@PathVariable long id){
        return addressBookService.deleteContactById(id);
    }
}
