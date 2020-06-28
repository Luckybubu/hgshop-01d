package com.tzh.goods.dao;

import java.util.List;

import com.tzh.goods.pojo.Brand;

public interface BrandDao {

	List<Brand> queryAll();

	Brand findById(int id);

}
