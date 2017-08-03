package com.rasg.manageteam.web.service;

import com.rasg.manageteam.business.PersonService;
import com.rasg.manageteam.data.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raasanch on 21/07/2017.
 */
@RestController
@RequestMapping(path = "/api")
@CrossOrigin
public class PersonServiceController {

  @Autowired
  private PersonService personService;

  @RequestMapping(method = RequestMethod.GET, path = "/persons")
  public Page<Person> getAllPersons(Pageable pageable) {
    Page<Person> persons = personService.getAllPersons(pageable);
    return persons;
  }

  @RequestMapping(method = RequestMethod.POST, path = "/persons")
  @ResponseStatus(HttpStatus.CREATED)
  public void createPerson(@RequestBody Person person) {
    personService.createPerson(person);
  }
}
