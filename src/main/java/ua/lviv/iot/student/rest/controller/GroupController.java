package ua.lviv.iot.student.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.student.business.GroupService;
import ua.lviv.iot.student.rest.model.Group;

@RequestMapping("/groups")
@RestController

public class GroupController {
    @Autowired
    private GroupService groupRepository;
    @GetMapping
    public List <Group> getAllGroups(){
       return groupRepository.findAll();
    }

}
