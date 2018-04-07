package com.example.teamrocket.data;

import com.example.teamrocket.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PersonDao extends CrudRepository<Person, Integer>{
}
