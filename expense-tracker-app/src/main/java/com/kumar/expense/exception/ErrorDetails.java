package com.kumar.expense.exception;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetails {
  private LocalDateTime timestamp;
  private String message;
  private String details;
  private String errorCode;
}
