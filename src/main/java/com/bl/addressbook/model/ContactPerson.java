package com.bl.addressbook.model;

import com.bl.addressbook.dto.ContactPersonDTO;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ContactPerson {
    @Id
    @GeneratedValue
    private Long personId;
    private String name;
    private String address;
    private String city;
    @ElementCollection
    private List<Long> phoneNumbers;

    public ContactPerson() {
    }

    public ContactPerson(String name, String address, String city, List<Long> phoneNumbers) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumbers = phoneNumbers;
    }

    public ContactPerson(ContactPersonDTO contactPersonDTO) {
        this.name = contactPersonDTO.getName();
        this.address = contactPersonDTO.getAddress();
        this.city = contactPersonDTO.getCity();
        this.phoneNumbers = contactPersonDTO.getPhoneNumbers();
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Long> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    public String toJson() {
        return  "\npersonId: " + personId +
                ", \nname: " + name +
                ", \naddress: " + address +
                ", \ncity: " + city +
                ", \nphoneNumbers: " + phoneNumbers;
    }
}
