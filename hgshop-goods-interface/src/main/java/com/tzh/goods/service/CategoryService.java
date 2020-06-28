package com.tzh.goods.service;

import java.util.List;

import com.tzh.goods.pojo.Category;
/**
 * 分类管理
 * @author 86188
 *
 */
public interface CategoryService {

	//添加
	public int add(Category category);
	
	public int update(Category category);
	
	public int del(int  id);
	
	public List<Category> list(int parentId);
}
