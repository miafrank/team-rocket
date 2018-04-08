package com.example.teamrocket.controllers;

import com.example.teamrocket.data.BodyPartDao;
import com.example.teamrocket.data.HealthTraitDao;
import com.example.teamrocket.data.PersonDao;
import com.example.teamrocket.data.PhysicalScoreDao;
import com.example.teamrocket.models.BodyPart;
import com.example.teamrocket.models.HealthTrait;
import com.example.teamrocket.models.Person;
import com.example.teamrocket.models.PhysicalScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private HealthTraitDao healthTraitsDao;

    @Autowired
    private PersonDao personDao;

    @Autowired
    private BodyPartDao bodyPartDao;

    @Autowired
    private PhysicalScoreDao physicalScoreDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String humanForm(Model model) {
        BodyPart head = bodyPartDao.findByName("Head");
        model.addAttribute("title", "Hey girl, What's going on today?");
        model.addAttribute("healthTraits", healthTraitsDao.findAll());
        model.addAttribute("headHealthTraits", healthTraitsDao.findByBodyPart(head));
        return "home";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String processHumanForm(Model model, @RequestParam int HealthTraitId) {

        Person person = personDao.findByFirstNameIs("Mia");
        HealthTrait healthTrait = healthTraitsDao.findOne(HealthTraitId);
        person.addHealthTrait(healthTrait);
        personDao.save(person);
        return "redirect:/";
    }

    @RequestMapping(value = "/trackingAnswer", method = RequestMethod.POST)
    public String processTrackingQuestion(Model model, @RequestParam(name="trackingQAnswerid") int trackingQAnswerid) {

        PhysicalScore physicalScore = new PhysicalScore();
        physicalScore.setScore(trackingQAnswerid);
        physicalScoreDao.save(physicalScore);
        HealthTrait headache = healthTraitsDao.findByName("Headache");
        headache.addPhysicalScore(physicalScore);
        healthTraitsDao.save(headache);
        return "redirect:/";

    }


}

