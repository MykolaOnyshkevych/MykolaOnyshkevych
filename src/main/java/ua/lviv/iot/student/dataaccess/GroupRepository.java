package ua.lviv.iot.student.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.student.rest.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer>{

}
