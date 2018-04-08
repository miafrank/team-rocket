package com.example.teamrocket.data;


import com.example.teamrocket.models.BodyPart;
import com.example.teamrocket.models.HealthTrait;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface BodyPartDao extends CrudRepository<BodyPart, Integer>{

    BodyPart findByName(String name);

}
