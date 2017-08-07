package com.rasg.manageteam.data.repository;

import com.rasg.manageteam.data.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by raasanch on 21/07/2017.
 */
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

  @Override
  Page<Person> findAll(Pageable pageable);
}
