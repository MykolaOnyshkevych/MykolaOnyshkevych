package ua.lviv.iot.student.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.student.rest.model.AbstractExerciseMachine;;

@Repository
public interface ExerciseMachineRepository extends JpaRepository<AbstractExerciseMachine, Integer> {
}