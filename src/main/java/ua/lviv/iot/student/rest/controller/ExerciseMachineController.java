package ua.lviv.iot.student.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.student.rest.business.ExerciseMachineService;
import ua.lviv.iot.student.rest.model.AbstractExerciseMachine;

import java.util.List;

@RequestMapping("/racetracks")
@RestController
public class ExerciseMachineController {

    @Autowired
    private ExerciseMachineService  exerciseMachineService;

    @GetMapping
    public final List<AbstractExerciseMachine> getAllRaceTracks() {
        return exerciseMachineService.getAllRaceTracks();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<AbstractExerciseMachine> getRaceTrack(final @PathVariable("id") Integer id) {
        AbstractExerciseMachine raceTrackModel;
        return (raceTrackModel = exerciseMachineService.getRaceTrack(id)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(raceTrackModel, HttpStatus.OK);
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public final AbstractExerciseMachine createRaceTrack(final @RequestBody AbstractExerciseMachine raceTrack) {
        return exerciseMachineService.createRaceTrack(raceTrack);
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<AbstractExerciseMachine> deleteRaceTrack(final @PathVariable("id") Integer id) {
        HttpStatus status = exerciseMachineService.deleteRaceTrack(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(status);
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity<AbstractExerciseMachine> updateRaceTrack(final @PathVariable("id") Integer id,
            final @RequestBody AbstractExerciseMachine raceTrack) {
        raceTrack.setId(id);
        AbstractExerciseMachine initialRaceTrack;
        return (initialRaceTrack = exerciseMachineService.updateraceTrack(id, raceTrack)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(initialRaceTrack, HttpStatus.OK);
    }
}