package com.kumar.expense.service;

import java.util.List;

import com.kumar.expense.dto.CategoryDto;

public interface CategoryService {
   
	CategoryDto createCategory(CategoryDto categoryDto);
	
	CategoryDto getCategoryById(Long categoryId);
	
	List<CategoryDto> getAllCategories();
	
	CategoryDto updateCategory(Long categoryId,CategoryDto categoryDto);
	
	void deleteCategoryById(Long categoryId);
}
