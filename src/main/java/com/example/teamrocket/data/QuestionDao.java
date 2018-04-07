package com.example.teamrocket.data;

import com.example.teamrocket.models.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface QuestionDao extends CrudRepository<Integer, Question> {
}
