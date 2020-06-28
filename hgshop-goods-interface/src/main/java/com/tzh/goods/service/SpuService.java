package com.tzh.goods.service;

import com.github.pagehelper.PageInfo;
import com.tzh.goods.pojo.Spu;
import com.tzh.goods.pojo.SpuVo;

public interface SpuService {

	int add(Spu spu);
	int update(Spu spu);
	int delete(int[] ids);
	PageInfo<Spu> list(SpuVo spuVo);
	Spu GetById(int id);
}
