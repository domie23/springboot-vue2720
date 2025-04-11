package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TongzhitonggaoDao;
import com.entity.TongzhitonggaoEntity;
import com.service.TongzhitonggaoService;
import com.entity.vo.TongzhitonggaoVO;
import com.entity.view.TongzhitonggaoView;

@Service("tongzhitonggaoService")
public class TongzhitonggaoServiceImpl extends ServiceImpl<TongzhitonggaoDao, TongzhitonggaoEntity> implements TongzhitonggaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhitonggaoEntity> page = this.selectPage(
                new Query<TongzhitonggaoEntity>(params).getPage(),
                new EntityWrapper<TongzhitonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhitonggaoEntity> wrapper) {
		  Page<TongzhitonggaoView> page =new Query<TongzhitonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhitonggaoVO> selectListVO(Wrapper<TongzhitonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhitonggaoVO selectVO(Wrapper<TongzhitonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhitonggaoView> selectListView(Wrapper<TongzhitonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhitonggaoView selectView(Wrapper<TongzhitonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
