package com.example.demo.student;
import jakarta.persistence.*;

@Entity
@Table
public class Student{
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String studentClass;

    public Student(String name, String surname, int age, String studentClass, Long id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentClass = studentClass;
        this.id = id;
    }

    public Student(String name) {

    }

    public Student(String name, String surname, int age, String studentClass) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentClass = studentClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", studentClass='" + studentClass + '\'' +
                '}';
    }
}
