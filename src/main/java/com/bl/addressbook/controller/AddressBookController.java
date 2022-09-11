package com.bl.addressbook.controller;

import com.bl.addressbook.dto.ContactPersonDTO;
import com.bl.addressbook.dto.ResponseDTO;
import com.bl.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/addressbookapp")
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    @GetMapping(value = {"", "/"})
    public ResponseEntity<ResponseDTO> hello() {
        return addressBookService.welcomeMessage();
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getPersonById(@PathVariable Long personId) {
        return addressBookService.getPersonById(personId);
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getPersonByName(@RequestParam String name) {
        return addressBookService.getPersonByName(name);
    }

    @GetMapping("/get/all")
    public ResponseEntity<ResponseDTO> getAllPersons() {
        return addressBookService.getAllPersons();
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addContact(@Valid @RequestBody ContactPersonDTO contactPersonDTO) {
        return addressBookService.addContact(contactPersonDTO);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateContact(@Valid @PathVariable long id, @RequestBody ContactPersonDTO contactPersonDTO) {
        return addressBookService.updateById(id, contactPersonDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteContactById(@PathVariable long id) {
        return addressBookService.deleteContactById(id);
    }
}
