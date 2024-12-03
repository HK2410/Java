package com.kumar.expense.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kumar.expense.dto.ExpenseDto;
import com.kumar.expense.entity.Category;
import com.kumar.expense.entity.Expense;
import com.kumar.expense.exception.ResourceNotFoundException;
import com.kumar.expense.mapper.ExpenseMapper;
import com.kumar.expense.repository.CategoryRepository;
import com.kumar.expense.repository.ExpenseRepository;
import com.kumar.expense.service.ExpenseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ExpenseServiceImpl implements ExpenseService{
    private ExpenseRepository expenseRepository;
    private CategoryRepository categoryRepository;

	@Override
	public ExpenseDto createExpense(ExpenseDto expenseDto) {
		Expense expense = ExpenseMapper.mapToExpense(expenseDto);
		Expense createdExpense = expenseRepository.save(expense);
		return ExpenseMapper.mapToExpenseDto(createdExpense);
	}
	
	
	@Override
	public ExpenseDto getExpenseById(Long expenseId) {
		Expense expense = expenseRepository.findById(expenseId)
				          .orElseThrow(()->new ResourceNotFoundException("Expense Not Found With Id :"+expenseId));
		return ExpenseMapper.mapToExpenseDto(expense);
	}
	
	
	@Override
	public List<ExpenseDto> getAllExpenses() {
		List<Expense> expenses = expenseRepository.findAll();
		return expenses.stream().map((expense)->ExpenseMapper.mapToExpenseDto(expense))
				.collect(Collectors.toList());
	}


	@Override
	public ExpenseDto updateExpense(Long expenseId, ExpenseDto expenseDto) {
        Expense expense = expenseRepository.findById(expenseId)
		          .orElseThrow(()->new ResourceNotFoundException("Expense Not Found With Id :"+expenseId));
        expense.setAmount(expenseDto.amount());
        expense.setExpenseDate(expenseDto.expenseDate());
        //update Category
        if(expenseDto.categoryDto()!=null) {
        Category category = categoryRepository.findById(expenseDto.categoryDto().id())
        		.orElseThrow(()->new ResourceNotFoundException("Category Not Found With Id :"+expenseDto.categoryDto().id())); 
        expense.setCategory(category);

        }
		return ExpenseMapper.mapToExpenseDto(expenseRepository.save(expense));
	}


	@Override
	public void deleteExpense(Long expenseId) {
    Expense expense = expenseRepository.findById(expenseId)
    		.orElseThrow(()->new ResourceNotFoundException("Expense Not Found With Id :"+expenseId));
    expenseRepository.deleteById(expenseId);
	}

}
