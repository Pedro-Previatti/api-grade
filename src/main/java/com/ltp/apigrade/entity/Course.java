package com.ltp.apigrade.entity;

import javax.validation.constraints.NotBlank;

public class Course {

    private Long id;
    @NotBlank(message = "Subject cannot be found")
    private String subject;
    @NotBlank(message = "Course code cannot be blank")
    private String code;
    @NotBlank(message = "Description cannot be blank")
    private String description;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
