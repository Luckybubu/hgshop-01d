package com.tzh.goods.dao;

import java.util.List;

import com.tzh.goods.pojo.Category;

public interface CategoryDao {

	List<Category> list(int parentId);

	int del(int id);

	int update(Category category);

	int add(Category category);

	
}
