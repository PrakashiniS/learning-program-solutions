package com.example.employeeapi.exception;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.slf4j.*;
import org.springframework.http.*;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.*;
import org.springframework.http.converter.HttpMessageNotReadableException;

  
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(
        HttpMessageNotReadableException ex, HttpHeaders headers,
        HttpStatus status, WebRequest request) {
      LOGGER.info("Start parse error");
      Map<String, Object> body = new LinkedHashMap<>();
      body.put("timestamp", new Date());
      body.put("status", status.value());
      body.put("error", "Bad Request");
      Throwable cause = ex.getCause();
      if (cause instanceof InvalidFormatException) {
        for (InvalidFormatException.Reference ref : ((InvalidFormatException) cause).getPath()) {
          body.put("message", "Incorrect format for field '" + ref.getFieldName() + "'");
        }
      }
      return new ResponseEntity<>(body, headers, status);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
        MethodArgumentNotValidException ex, HttpHeaders headers,
        HttpStatus status, WebRequest request) {
      LOGGER.info("Start validation errors");
      Map<String, Object> body = new LinkedHashMap<>();
      body.put("timestamp", new Date());
      body.put("status", status.value());
      List<String> errors = ex.getBindingResult().getFieldErrors().stream()
          .map(e -> e.getDefaultMessage()).toList();
      body.put("errors", errors);
      return new ResponseEntity<>(body, headers, status);
    }
}