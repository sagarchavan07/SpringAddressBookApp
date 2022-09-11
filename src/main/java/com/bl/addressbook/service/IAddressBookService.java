package com.bl.addressbook.service;

import com.bl.addressbook.dto.ContactPersonDTO;
import com.bl.addressbook.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;

public interface IAddressBookService {
    ResponseEntity<ResponseDTO> welcomeMessage();
    ResponseEntity<ResponseDTO> getPersonById(long id);
    ResponseEntity<ResponseDTO> getPersonByName(String name);
    ResponseEntity<ResponseDTO> getAllPersons();
    ResponseEntity<ResponseDTO> addContact(ContactPersonDTO contactPersonDTO);
    ResponseEntity<ResponseDTO> updateById(long id, ContactPersonDTO contactPersonDTO);
    ResponseEntity<ResponseDTO> deleteContactById(long id);
}
