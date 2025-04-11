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


import com.dao.LingdaoDao;
import com.entity.LingdaoEntity;
import com.service.LingdaoService;
import com.entity.vo.LingdaoVO;
import com.entity.view.LingdaoView;

@Service("lingdaoService")
public class LingdaoServiceImpl extends ServiceImpl<LingdaoDao, LingdaoEntity> implements LingdaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingdaoEntity> page = this.selectPage(
                new Query<LingdaoEntity>(params).getPage(),
                new EntityWrapper<LingdaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingdaoEntity> wrapper) {
		  Page<LingdaoView> page =new Query<LingdaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingdaoVO> selectListVO(Wrapper<LingdaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingdaoVO selectVO(Wrapper<LingdaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingdaoView> selectListView(Wrapper<LingdaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingdaoView selectView(Wrapper<LingdaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
