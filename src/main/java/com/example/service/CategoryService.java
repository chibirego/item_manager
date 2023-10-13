package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CategoryRepository;

import java.util.List;
import com.example.entity.Category;

@Service
public class CategoryService {
	private final CategoryRepository CategoryRepository;
	
	@Autowired
	public CategoryService(CategoryRepository categoryRepository) {
		this.CategoryRepository = categoryRepository;
	}
	
	public List<Category> findAll() {
		return this.CategoryRepository.findAll();
	}
}
