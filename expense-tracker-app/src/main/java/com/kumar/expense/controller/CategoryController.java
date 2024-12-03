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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.expense.dto.CategoryDto;
import com.kumar.expense.service.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {
     private CategoryService categoryService;
     
     //Build Rest APi For Create Categories
     @PostMapping("/create")
     public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto){
    	 CategoryDto category = categoryService.createCategory(categoryDto);
    	 return new ResponseEntity<CategoryDto>(category,HttpStatus.CREATED);
     }
     
     //Build Rest API for Get Category By Id
     @GetMapping("/getCategory/{id}")
     public ResponseEntity<CategoryDto> getCategoryById(@PathVariable("id") Long categoryId){
    	 CategoryDto categoryDto = categoryService.getCategoryById(categoryId);
    	 return ResponseEntity.ok(categoryDto);
     }
     
     //Build Rest API to get All Categories
     @GetMapping
     public ResponseEntity<List<CategoryDto>> getAllCategories(){
    	 List<CategoryDto> categories = categoryService.getAllCategories();
    	 return ResponseEntity.ok(categories);
     }
     
     //Build Rest API to update category
     @PutMapping("/update/{id}")
     public ResponseEntity<CategoryDto> updateCategory(@PathVariable("id") Long categoryId,@RequestBody CategoryDto categoryDto){
    	 CategoryDto updateCategoryDto = categoryService.updateCategory(categoryId, categoryDto);
    	 return ResponseEntity.ok(updateCategoryDto);
     }
     
     //Build Rest API to delete category
     @DeleteMapping("/delete/{id}")
     public String deleteCategory(@PathVariable("id") Long categoryId) {
    	  categoryService.deleteCategoryById(categoryId);
    	  return "Category Deleted Successfully";
     }
}
