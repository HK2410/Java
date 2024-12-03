package com.kumar.expense.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.expense.dto.ExpenseDto;
import com.kumar.expense.service.ExpenseService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/expenses")
@AllArgsConstructor
public class ExpenseController {
   private ExpenseService expenseService;
	//Build API To Create New Expense
   @PostMapping("/create")
	public ResponseEntity<ExpenseDto> createExpense(@RequestBody ExpenseDto expenseDto){
		ExpenseDto createdDxpenseDto = expenseService.createExpense(expenseDto);
		return new ResponseEntity<ExpenseDto>(createdDxpenseDto,HttpStatus.CREATED);
	}
   
   
   //Build API To get Expense by id
   @GetMapping("{id}")
   public ResponseEntity<ExpenseDto> getExpenseById(@PathVariable("id") Long expenseId){
	   ExpenseDto expenseDto = expenseService.getExpenseById(expenseId);
	   return ResponseEntity.ok(expenseDto);
   }
   
   //Build API To Get All Expenses
   @GetMapping
   public ResponseEntity<List<ExpenseDto>> getAllExpenses(){
	   List<ExpenseDto> expenseList = expenseService.getAllExpenses();
	   return ResponseEntity.ok(expenseList);
   }
   
   //Build API To Update Expense
   @PutMapping("/update/{id}")
   public ResponseEntity<ExpenseDto> updateExpense(@PathVariable("id") Long expenseId,@RequestBody ExpenseDto expenseDto){
	   ExpenseDto updatedExpense = expenseService.updateExpense(expenseId, expenseDto);
	   return ResponseEntity.ok(updatedExpense);
   }
   
   //Build API To Delete Expense
   @DeleteMapping("delete/{id}")
   public String deleteExpense(@PathVariable("id") Long expenseId) {
	   expenseService.deleteExpense(expenseId);
	   return "Expense Deleted Successfully";
   }
}
