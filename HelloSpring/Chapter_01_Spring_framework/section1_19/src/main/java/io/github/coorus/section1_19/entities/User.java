package io.github.coorus.section1_19.entities;

import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private Timestamp createdAt; // Ensure the field name matches the database column name
}
