package com.kumar.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumar.expense.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {

}
