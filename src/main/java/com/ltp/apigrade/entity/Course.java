package com.ltp.apigrade.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.*;

@Entity
@Table(name = "course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotBlank(message = "Subject cannot be found")
    @Column(name = "subject", nullable = false)
    private String subject;
    @NotBlank(message = "Course code cannot be blank")
    @Column(name = "code", nullable = false)
    private String code;
    @NotBlank(message = "Description cannot be blank")
    @Column(name = "description", nullable = false)
    private String description;
}
