package com.tzh.goods.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.tzh.goods.dao.CategoryDao;
import com.tzh.goods.pojo.Category;
import com.tzh.goods.service.CategoryService;
/**
 * 分类管理的服务
 * @author 86188
 *
 */
@Service(interfaceClass =  CategoryService.class)
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public int add(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.add(category);
	}

	@Override
	public int update(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.update(category);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return categoryDao.del(id);
	}

	@Override
	public List<Category> list(int parentId) {
		// TODO Auto-generated method stub
		return categoryDao.list(parentId);
	}

}
