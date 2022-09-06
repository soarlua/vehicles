package com.interview.vehicles.app.entrypoint.http.exceptions;

import com.interview.vehicles.domain.usecase.validate.ValidatedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

     @ExceptionHandler(value = {ValidatedException.class})
     protected ResponseEntity<ErrorMessage> handleConflict(ValidatedException ex, WebRequest request) {
         return new ResponseEntity<ErrorMessage>(
                 new ErrorMessage(ex.getMessage()), new HttpHeaders(), HttpStatus.PRECONDITION_FAILED);
     }
}

