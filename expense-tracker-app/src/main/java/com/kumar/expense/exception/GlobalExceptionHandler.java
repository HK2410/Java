package com.kumar.expense.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
   
	//Handle Specific Exception
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(
			ResourceNotFoundException exception,WebRequest webRequest){
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setTimestamp(LocalDateTime.now());
		errorDetails.setErrorCode("RESOURCE_NOT_FOUND");
		errorDetails.setMessage(webRequest.getDescription(false));
		errorDetails.setDetails(exception.getMessage());
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}
	
	//Handle Generic Exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleGenericException(
			ResourceNotFoundException exception,WebRequest webRequest){
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setTimestamp(LocalDateTime.now());
		errorDetails.setErrorCode("INTERNAL_SERVER_ERROR");
		errorDetails.setMessage(webRequest.getDescription(false));
		errorDetails.setDetails(exception.getMessage());
		return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
