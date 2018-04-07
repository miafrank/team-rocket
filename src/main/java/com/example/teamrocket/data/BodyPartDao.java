package com.example.teamrocket.data;


import com.example.teamrocket.models.BodyPart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface BodyPartDao extends CrudRepository<BodyPart, Integer>{
}
