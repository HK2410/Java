package com.bank.dto;

public record TransferFundDto(Long fromAccountId,Long toAccountId,
		double amount) {

}
