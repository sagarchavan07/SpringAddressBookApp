package com.bl.addressbook.repository;

import com.bl.addressbook.model.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<ContactPerson, Long> {
}
