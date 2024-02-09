package com.ltp.apigrade.entity;

import com.ltp.apigrade.validation.Score;

public class Grade {
    
    private Long id;
    @Score
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
