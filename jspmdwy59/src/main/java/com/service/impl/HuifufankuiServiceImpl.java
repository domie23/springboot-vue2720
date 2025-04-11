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


import com.dao.HuifufankuiDao;
import com.entity.HuifufankuiEntity;
import com.service.HuifufankuiService;
import com.entity.vo.HuifufankuiVO;
import com.entity.view.HuifufankuiView;

@Service("huifufankuiService")
public class HuifufankuiServiceImpl extends ServiceImpl<HuifufankuiDao, HuifufankuiEntity> implements HuifufankuiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuifufankuiEntity> page = this.selectPage(
                new Query<HuifufankuiEntity>(params).getPage(),
                new EntityWrapper<HuifufankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuifufankuiEntity> wrapper) {
		  Page<HuifufankuiView> page =new Query<HuifufankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuifufankuiVO> selectListVO(Wrapper<HuifufankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuifufankuiVO selectVO(Wrapper<HuifufankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuifufankuiView> selectListView(Wrapper<HuifufankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuifufankuiView selectView(Wrapper<HuifufankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
