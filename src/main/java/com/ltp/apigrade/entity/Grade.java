package com.ltp.apigrade.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ltp.apigrade.validation.Score;

@Entity
@Table(name = "grade")
public class Grade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Score
    @Column(name = "score", nullable = false)
    private String score;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String score() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
