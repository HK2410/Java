package com.bank.service;

import java.util.List;

import com.bank.dto.AccountDto;
import com.bank.dto.TransactionDto;
import com.bank.dto.TransferFundDto;

public interface AccountService {
   AccountDto createAccount(AccountDto accountDto);
   AccountDto getAccountById(Long id);
   AccountDto deposit(Long id,double amount);
   AccountDto withdraw(Long id,double amount);
   List<AccountDto> getAllAccounts();
   void deleteAccount(Long id);
   void tranferFunds(TransferFundDto transferFundDto);
   List<TransactionDto> getAccountTransactions(Long accountId);
}
