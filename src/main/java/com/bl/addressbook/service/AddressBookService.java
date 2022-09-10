package com.bl.addressbook.service;

import com.bl.addressbook.dto.ContactPersonDTO;
import com.bl.addressbook.dto.ResponseDTO;
import com.bl.addressbook.model.ContactPerson;
import com.bl.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {

    @Autowired
    AddressBookRepository addressBookRepository;

    public ResponseEntity<ResponseDTO> welcomeMessage(){
        ResponseDTO responseDTO = new ResponseDTO("GET call success","Welcome to AddressBook Application");
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    public ResponseEntity<ResponseDTO> getPersonById(long id){
        ResponseDTO responseDTO = new ResponseDTO("GET call success",addressBookRepository.findById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> addContact(ContactPersonDTO contactPersonDTO) {
        ResponseDTO responseDTO = new ResponseDTO("Contact Added", addressBookRepository.save(new ContactPerson(contactPersonDTO)));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    public ResponseEntity<ResponseDTO> updateById(long id, ContactPersonDTO contactPersonDTO) {
        ContactPerson contactPerson = new ContactPerson(contactPersonDTO);
        contactPerson.setPersonId(id);
        ResponseDTO responseDTO = new ResponseDTO("Contact Updated", addressBookRepository.save(contactPerson));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    public ResponseEntity<ResponseDTO> deleteContactById(long id) {
        addressBookRepository.deleteById(id);
        ResponseDTO responseDTO = new ResponseDTO("Contact Deleted","id = " + id);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
}
