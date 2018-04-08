package com.example.teamrocket.controllers;

import com.example.teamrocket.data.BodyPartDao;
import com.example.teamrocket.data.HealthTraitDao;
import com.example.teamrocket.data.PersonDao;
import com.example.teamrocket.models.BodyPart;
import com.example.teamrocket.models.HealthTrait;
import com.example.teamrocket.models.Person;
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

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String humanForm(Model model) {
        BodyPart head = bodyPartDao.findByName("Head");
        BodyPart chest = bodyPartDao.findByName("Chest");
        BodyPart stomach = bodyPartDao.findByName("Stomach");
        BodyPart leg = bodyPartDao.findByName("Leg");
        model.addAttribute("title", "Add to my Health");
        model.addAttribute("healthTraits", healthTraitsDao.findAll());
        model.addAttribute("headHealthTraits", healthTraitsDao.findByBodyPart(head));
        model.addAttribute("chestHealthTraits", healthTraitsDao.findByBodyPart(chest));
        model.addAttribute("stomachHealthTraits", healthTraitsDao.findByBodyPart(stomach));
        model.addAttribute("legHealthTraits", healthTraitsDao.findByBodyPart(leg));
        return "home";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String processHumanForm(Model model, @RequestParam int healthTraitId) {
        Person person = personDao.findByFirstNameIs("Mia");
        HealthTrait healthTrait = healthTraitsDao.findOne(healthTraitId);
        person.addHealthTrait(healthTrait);
        personDao.save(person);
        return "redirect:/";
    }

}

