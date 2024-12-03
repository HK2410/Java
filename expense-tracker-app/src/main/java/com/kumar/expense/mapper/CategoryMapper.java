package com.kumar.expense.mapper;

import com.kumar.expense.dto.CategoryDto;
import com.kumar.expense.entity.Category;

public class CategoryMapper {
  //Map CategoryDto to Category Entity
	public static Category mapToCategory(CategoryDto categoryDto) {
		return new Category(categoryDto.id(),categoryDto.name());
	}
	
	//Map Category Entity to CategoryDto
	public static CategoryDto mapToCategoryDto(Category category) {
		return new CategoryDto(category.getId(),category.getName());
	}

}
