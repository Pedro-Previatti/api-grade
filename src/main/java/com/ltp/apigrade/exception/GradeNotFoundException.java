package com.ltp.apigrade.exception;

public class GradeNotFoundException extends RuntimeException {
    
    public GradeNotFoundException(Long studentId, Long courseId) {
        super("The grade with sudent id: '" + studentId + "' and course id: '" + courseId + "' does not exist in our records");
    }
}
