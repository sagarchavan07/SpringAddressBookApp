package com.bl.addressbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactPersonDTO {
    private String name;
    private String address;
    private String city;
    private List<Long> phoneNumber;
}
