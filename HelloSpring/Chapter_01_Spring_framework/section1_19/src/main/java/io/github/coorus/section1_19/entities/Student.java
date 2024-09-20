package io.github.coorus.section1_19.entities;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {
    private Integer id;
    private String name;
    private char gender;
    private int age;
    private LocalDate birthDate;
}
