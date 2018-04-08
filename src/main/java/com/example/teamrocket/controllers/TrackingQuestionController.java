package com.example.teamrocket.controllers;

import com.example.teamrocket.data.HealthTraitDao;
import com.example.teamrocket.data.TrackingQuestionDao;
import com.example.teamrocket.models.*;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Tracking-Question")
public class TrackingQuestionController {

	@Autowired
    private TrackingQuestionDao trackingQuestionDao;
	

    @RequestMapping(value = "getTrackingQuestion", method = RequestMethod.GET)
    public TrackingQuestion getATrackingQuestion() {
    	
        TrackingQuestion trackingQuestion = trackingQuestionDao.findOne(1);
        return trackingQuestion;
    }
    @RequestMapping(value = "submitTrackingQuestion", method = RequestMethod.POST)
    public void processATrackingQuestion( TrackingQuestion trackingQuestion ) {
    	TrackingQuestion changetrackingQuestion = trackingQuestionDao.findOne(trackingQuestion.getId());
    	changetrackingQuestion.setAnswer(trackingQuestion.getAnswer());
    	trackingQuestionDao.save(changetrackingQuestion);
    }
}
