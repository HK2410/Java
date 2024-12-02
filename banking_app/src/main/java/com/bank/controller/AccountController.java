package com.bank.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.dto.AccountDto;
import com.bank.dto.TransactionDto;
import com.bank.dto.TransferFundDto;
import com.bank.repository.AccountRepository;
import com.bank.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
   private AccountService accountService;

public AccountController(AccountService accountService) {
	this.accountService = accountService;
}

//Add Account API
@PostMapping
public ResponseEntity<AccountDto> addAccount(@RequestBody  AccountDto accountDto){
	return new ResponseEntity<AccountDto>(accountService.createAccount(accountDto), HttpStatus.CREATED);
}

//Get Account API
@GetMapping("/{id}")
public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
	AccountDto accountDto = accountService.getAccountById(id);
	return ResponseEntity.ok(accountDto);
}

//Deposit Api
@PutMapping("/{id}/deposit")
public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
		@RequestBody Map<String,Double> request
		){
	Double amount = request.get("amount");
	AccountDto account = accountService.deposit(id,amount);
	return ResponseEntity.ok(account);
}

//withdraw API
@PostMapping("/withdraw/{id}")
public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
		@RequestBody Map<String,Double> request){
	Double amount = request.get("amount");
	AccountDto accountDto = accountService.withdraw(id,amount);
	return ResponseEntity.ok(accountDto);
}

//get All Accounts
@GetMapping
public ResponseEntity<List<AccountDto>> getAllAccounts(){
	List<AccountDto> accounts = accountService.getAllAccounts();
	return ResponseEntity.ok(accounts);
}

//delete API
@PostMapping("delete/{id}")
public ResponseEntity<String> deleteAccount(@PathVariable Long id){
	accountService.deleteAccount(id);
	return ResponseEntity.ok("Account has been deleted successfully");
}

//Transfer API
@PostMapping("transfer")
public ResponseEntity<String> transferFund(@RequestBody TransferFundDto transferFundDto){
	accountService.tranferFunds(transferFundDto);
	return ResponseEntity.ok("Transfered Succesfully");
}

//Transactions API
@GetMapping("/transactions/{id}")
public ResponseEntity<List<TransactionDto>> getAccountTransactions(@PathVariable("id")  Long accountId){
  List<TransactionDto> transactions =	accountService.getAccountTransactions(accountId);
  return ResponseEntity.ok(transactions);
}
}
 