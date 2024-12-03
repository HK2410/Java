package com.kumar.expense.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kumar.expense.dto.CategoryDto;
import com.kumar.expense.entity.Category;
import com.kumar.expense.exception.ResourceNotFoundException;
import com.kumar.expense.mapper.CategoryMapper;
import com.kumar.expense.repository.CategoryRepository;
import com.kumar.expense.service.CategoryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private CategoryRepository categoryRepository;
    
    
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		
		//Convert CategoryDto to Category
		Category category = CategoryMapper.mapToCategory(categoryDto);
		
		//Save Category in database
		Category savedCategory = categoryRepository.save(category);
		
		//Return CategoryDto
		return CategoryMapper.mapToCategoryDto(savedCategory);
	}


	@Override
	public CategoryDto getCategoryById(Long categoryId) {
		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(()->new ResourceNotFoundException("Category Not Found With Id :"+categoryId));
		return CategoryMapper.mapToCategoryDto(category);
	}


	@Override
	public List<CategoryDto> getAllCategories() {
		List<Category> categories = categoryRepository.findAll();
		return categories.stream().map((category)->CategoryMapper.mapToCategoryDto(category))
				.collect(Collectors.toList());
	}


	@Override
	public CategoryDto updateCategory(Long categoryId, CategoryDto categoryDto) {
		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(()->new ResourceNotFoundException("Category Not Found With Id :"+categoryId));
		category.setName(categoryDto.name());
		Category updatedCategory = categoryRepository.save(category);
		return CategoryMapper.mapToCategoryDto(updatedCategory);
	}


	@Override
	public void deleteCategoryById(Long categoryId) {
		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(()->new ResourceNotFoundException("Category Not Found With Id :"+categoryId));
        categoryRepository.deleteById(categoryId);	
	}

}
