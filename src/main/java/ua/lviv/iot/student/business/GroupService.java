package ua.lviv.iot.student.business;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.student.dataaccess.GroupRepository;
import ua.lviv.iot.student.rest.model.Group;
@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Group> findAll() {
        return null;
    }

}
