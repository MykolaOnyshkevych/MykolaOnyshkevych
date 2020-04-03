package ua.lviv.iot.student.business;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

import ua.lviv.iot.student.dataaccess.StudentRepository;
import ua.lviv.iot.student.rest.model.Student;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
   
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Integer id) {
        if (studentRepository.existsById(id)) {
            return studentRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public Student createStudent( Student student) {

        return studentRepository.save(student);
    }

    public boolean deleteStudent(Integer id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Student updateStudent(Integer id, Student student) {
        if (studentRepository.existsById(id)) {
            Student previousStudent = studentRepository.findById(id).get();
            studentRepository.save(student);
            return previousStudent;
        } else {
            return null;
        }
    }
}