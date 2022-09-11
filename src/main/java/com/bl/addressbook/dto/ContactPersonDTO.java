package com.bl.addressbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactPersonDTO {
    @Pattern(regexp = "^[A-Z][\\w\\s]{2,}$", message = "Invalid Name")
    private String name;
    private String address;
    private String city;
    private List<Long> phoneNumbers;
}
