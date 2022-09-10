package com.bl.addressbook.model;

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
    private List<Long> phoneNumber;

    public ContactPerson() {
    }

    public ContactPerson(Long personId, String name, String address, String city, List<Long> phoneNumber) {
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
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

    public List<Long> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<Long> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
