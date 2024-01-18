package com.consulta.automotores.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<Object> handleStudentNotFoundException(NotFoundException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }

    @ExceptionHandler({InternalServerException.class})
    public ResponseEntity<Object> handleStudentAlreadyExistsException(InternalServerException exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<Object> handleRuntimeException(RuntimeException exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }
}
