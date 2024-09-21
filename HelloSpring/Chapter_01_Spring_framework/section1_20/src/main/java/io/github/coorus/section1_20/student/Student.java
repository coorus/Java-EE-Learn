package io.github.coorus.section1_20.student;

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
    private LocalDate birthDate;
}
