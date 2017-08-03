package com.rasg.manageteam.business;

import com.rasg.manageteam.data.entity.Person;
import com.rasg.manageteam.data.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by raasanch on 21/07/2017.
 */
@Service
public class PersonService {

  private PersonRepository personRepository;

  @Autowired
  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public Page<Person> getAllPersons(Pageable pageable) {
    return personRepository.findAll(pageable);
  }

  public void createPerson(Person person) {
    personRepository.save(person);
  }

}
