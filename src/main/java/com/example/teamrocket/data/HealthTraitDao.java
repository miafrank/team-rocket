package com.example.teamrocket.data;

import com.example.teamrocket.models.BodyPart;
import com.example.teamrocket.models.HealthTrait;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface HealthTraitDao extends CrudRepository<HealthTrait, Integer>{

    List<HealthTrait> findByBodyPart(BodyPart bodyPart);

    HealthTrait findByName(String name);
}
