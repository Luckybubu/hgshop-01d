package com.tzh.goods.dao;

import java.util.List;

import com.tzh.goods.pojo.Spu;
import com.tzh.goods.pojo.SpuVo;

public interface SpuDao {

	Spu getById(int id);

	int delete(int[] ids);

	int update(Spu spu);

	int add(Spu spu);

	List<Spu> list(SpuVo spuVo);

}
