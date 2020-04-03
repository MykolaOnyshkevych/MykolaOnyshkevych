package ua.lviv.iot.student.rest.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private String name;
    private Integer enrollementYear;
    @OneToMany(mappedBy = "group", fetch =FetchType.EAGER)
    @JsonIgnoreProperties("group")
    private Set<Student> students;
  
    public Group() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnrollementYear() {
        return enrollementYear;
    }

    public void setEnrollementYear(Integer enrollementYear) {
        this.enrollementYear = enrollementYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
