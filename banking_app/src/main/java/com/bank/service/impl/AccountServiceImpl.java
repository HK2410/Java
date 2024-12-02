package com.bank.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bank.dto.AccountDto;
import com.bank.dto.TransactionDto;
import com.bank.dto.TransferFundDto;
import com.bank.entity.Account;
import com.bank.entity.Transaction;
import com.bank.exception.AccountException;
import com.bank.mapper.AccountMapper;
import com.bank.repository.AccountRepository;
import com.bank.repository.TransactionRepository;
import com.bank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
    
	private AccountRepository accountRepository;
	
	private TransactionRepository transactionRepository;
	
	private static final String TRANSACTION_TYPE_DEPOSIT ="DEPOSIT";
	
	private static final String TRANSACTION_TYPE_WITHDRAW ="WITHDRAW";
    
	private static final String TRANSACTION_TYPE_TRANSFER ="TRANSFER";

	public AccountServiceImpl(AccountRepository accountRepository,
			TransactionRepository transactionRepository	) {
		this.accountRepository = accountRepository;
		this.transactionRepository = transactionRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount =  accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Long id) {
		Account account = accountRepository
				.findById(id)
				.orElseThrow(()-> new AccountException("Account does n't exist"));
		return AccountMapper.mapToAccountDto(account);
	}

	@Override
	public AccountDto deposit(Long id, double amount) {
		// TODO Auto-generated method stub
		Account account = accountRepository
				.findById(id)
				.orElseThrow(()-> new AccountException("Account does n't exist"));
		double total = account.getBalance()+amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		Transaction transaction = new Transaction();
		transaction.setAccountId(id);
		transaction.setAmount(amount);
		transaction.setTimestamp(LocalDateTime.now());
		transaction.setTransactionType(TRANSACTION_TYPE_DEPOSIT);
		transactionRepository.save(transaction);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto withdraw(Long id, double amount) {
		Account account = accountRepository
				.findById(id)
				.orElseThrow(()-> new AccountException("Account does n't exist"));
        if(account.getBalance()<amount) {
        	throw new RuntimeException("Insufficient Balance");
        }
        Double balance = account.getBalance()-amount;
        account.setBalance(balance);
        Account savedAccount =  accountRepository.save(account);
        Transaction transaction = new Transaction();
        transaction.setAccountId(id);
        transaction.setAmount(amount);
        transaction.setTransactionType(TRANSACTION_TYPE_WITHDRAW);
        transaction.setTimestamp(LocalDateTime.now());
        transactionRepository.save(transaction);
		// TODO Auto-generated method stub
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public List<AccountDto> getAllAccounts() {
		// TODO Auto-generated method stub
		List<Account> accounts = accountRepository.findAll();
		return accounts.stream().map((account)->AccountMapper.mapToAccountDto(account))
				.collect(Collectors.toList());
	}

	@Override
	public void deleteAccount(Long id) {
		// TODO Auto-generated method stub
		Account account = accountRepository
				.findById(id)
				.orElseThrow(()-> new AccountException("Account does n't exist"));
      accountRepository.deleteById(id);
	}

	@Override
	public void tranferFunds(TransferFundDto transferFundDto) {
		// TODO Auto-generated method stub
		//Get the Account from which we want to send the amount
		Account fromAccount = accountRepository.findById(
				transferFundDto.fromAccountId()).orElseThrow(
						()->new AccountException("Account Does n't Exist"));
		
		//Get the Account to which we send the amount
		Account toAccount = accountRepository.findById(
				transferFundDto.toAccountId()).orElseThrow(
						()->new AccountException("Account Does n't Exist"));
		
		//Debit the amount from fromAccount
		if(fromAccount.getBalance()<transferFundDto.amount()) {
			throw new RuntimeException("Insufficient Amount");
		}
		fromAccount.setBalance(fromAccount.getBalance()-transferFundDto.amount());
		
		//Credit the amount from toAccount
		toAccount.setBalance(toAccount.getBalance()+transferFundDto.amount());
		accountRepository.save(fromAccount);
		accountRepository.save(toAccount);
		
		Transaction transaction = new Transaction();
		transaction.setAccountId(transferFundDto.fromAccountId());
		transaction.setAmount(transferFundDto.amount());
		transaction.setTimestamp(LocalDateTime.now());
		transaction.setTransactionType(TRANSACTION_TYPE_TRANSFER);
		transactionRepository.save(transaction);
	}

	@Override
	public List<TransactionDto> getAccountTransactions(Long accountId) {
		// TODO Auto-generated method stub
		List<Transaction> transactions = transactionRepository
				                         .findByAccountIdOrderByTimestampDesc(accountId);
		return transactions.stream().map((transaction)->convertEntityToDto(transaction))
				.collect(Collectors.toList());
	}

	private TransactionDto convertEntityToDto(Transaction transaction) {
		return new TransactionDto(transaction.getId(),
				transaction.getAccountId(),
				transaction.getAmount(),
				transaction.getTransactionType(),
				transaction.getTimestamp());
	}
}
 