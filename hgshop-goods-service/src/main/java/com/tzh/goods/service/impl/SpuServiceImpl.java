package com.tzh.goods.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tzh.goods.dao.SpuDao;
import com.tzh.goods.pojo.Spu;
import com.tzh.goods.pojo.SpuVo;
import com.tzh.goods.service.SpuService;
/**
 * spu的实现类
 * @author 86188
 *
 */
@Service(interfaceClass = SpuService.class)
public class SpuServiceImpl implements SpuService {

	@Autowired
	SpuDao spuDao;
	
	@Override
	public int add(Spu spu) {
		// TODO Auto-generated method stub
		return spuDao.add(spu);
	}

	@Override
	public int update(Spu spu) {
		// TODO Auto-generated method stub
		return spuDao.update(spu);
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		return spuDao.delete(ids);
	}

	@Override
	public PageInfo<Spu> list(SpuVo spuVo) {
		// TODO Auto-generated method stub
		PageHelper.startPage(spuVo.getPageNum(), spuVo.getPageNum());
		return new PageInfo<Spu>(spuDao.list(spuVo));
	}

	@Override
	public Spu GetById(int id) {
		// TODO Auto-generated method stub
		return spuDao.getById(id);
	}

}
