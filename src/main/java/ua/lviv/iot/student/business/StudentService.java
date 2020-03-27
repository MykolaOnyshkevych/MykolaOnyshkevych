package ua.lviv.iot.student.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.student.dataaccess.StudentRepository;
import ua.lviv.iot.student.rest.model.Student;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);

    }
}