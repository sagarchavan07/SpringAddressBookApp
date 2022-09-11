package com.bl.addressbook.repository;

import com.bl.addressbook.model.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<ContactPerson, Long> {

    @Query(value = "SELECT * FROM contact_person person WHERE person.name = :personName", nativeQuery = true)
    List<ContactPerson> findContactByName(@Param("personName") String personName);
}
