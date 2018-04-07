package com.example.teamrocket.data;

import com.example.teamrocket.models.HealthTrait;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface HealthTraitDao extends CrudRepository<HealthTrait, Integer>{
}
