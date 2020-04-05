package ua.lviv.iot.student.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.student.rest.dataaccess.ExerciseMachineRepository;
import ua.lviv.iot.student.rest.model.AbstractExerciseMachine;

import java.util.List;

@Service
public class ExerciseMachineService {

    @Autowired
    private ExerciseMachineRepository  exerciseMachineRepository;

    public List<AbstractExerciseMachine> getAllRaceTracks() {
        return exerciseMachineRepository.findAll();
    }

    public AbstractExerciseMachine getRaceTrack(Integer id) {
        if (exerciseMachineRepository.existsById(id)) {
            return exerciseMachineRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public AbstractExerciseMachine createRaceTrack(AbstractExerciseMachine raceTrack) {
        return exerciseMachineRepository.save(raceTrack);
    }

    public boolean deleteRaceTrack(Integer id) {
        if (exerciseMachineRepository.existsById(id)) {
            exerciseMachineRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public AbstractExerciseMachine updateraceTrack(Integer id, AbstractExerciseMachine raceTrack) {
        if (exerciseMachineRepository.existsById(id)) {
            AbstractExerciseMachine initialRaceTrack = exerciseMachineRepository.findById(id).get();
            exerciseMachineRepository.save(raceTrack);
            return initialRaceTrack;
        } else {
            return null;
        }
    }

}
