package com.bank.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transactions")
public class Transaction {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private Long accountId;
  private double amount;
  private String transactionType;//DEPOSIT,WITHDRAW,TRANSFER
  private LocalDateTime timestamp;
  public Transaction() {}
  
public Transaction(Long id, Long accountId, double amount, String transactionType, LocalDateTime timestamp) {
	this.id = id;
	this.accountId = accountId;
	this.amount = amount;
	this.transactionType = transactionType;
	this.timestamp = timestamp;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getAccountId() {
	return accountId;
}

public void setAccountId(Long accountId) {
	this.accountId = accountId;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getTransactionType() {
	return transactionType;
}

public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}

public LocalDateTime getTimestamp() {
	return timestamp;
}

public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}

  
}