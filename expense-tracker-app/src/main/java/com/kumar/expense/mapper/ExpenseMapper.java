package com.kumar.expense.mapper;

import com.kumar.expense.dto.CategoryDto;
import com.kumar.expense.dto.ExpenseDto;
import com.kumar.expense.entity.Category;
import com.kumar.expense.entity.Expense;

public class ExpenseMapper {
	
	//Convert Expense Entity to ExpenseDto
   public static ExpenseDto mapToExpenseDto(Expense expense) {
    return new ExpenseDto(
    		expense.getId(),
    		expense.getAmount(),
    		expense.getExpenseDate(),
    		new CategoryDto(
    		expense.getCategory().getId(),
    	    expense.getCategory().getName()
    	   )
    		);
}
   
   //Convert ExpenseDto to Expense
   public static Expense mapToExpense(ExpenseDto expenseDto) {
	    Category category =new Category();
	    category.setId(expenseDto.categoryDto().id());
	    return new Expense(expenseDto.id(),
	    		expenseDto.amount(),
	    		expenseDto.expenseDate(),
	    		category
	    		);
   }
}