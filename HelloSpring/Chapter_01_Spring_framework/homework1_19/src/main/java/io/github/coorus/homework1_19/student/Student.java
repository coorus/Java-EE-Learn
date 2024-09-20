package io.github.coorus.homework1_19.student;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {
    private Integer id;
    private String name;
    private char gender;
    private LocalDate birthDate;

    public Student(String name, char gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
