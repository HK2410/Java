package com.kumar.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumar.expense.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
