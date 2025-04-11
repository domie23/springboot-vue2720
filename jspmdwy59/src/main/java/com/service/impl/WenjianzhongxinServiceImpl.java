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


import com.dao.WenjianzhongxinDao;
import com.entity.WenjianzhongxinEntity;
import com.service.WenjianzhongxinService;
import com.entity.vo.WenjianzhongxinVO;
import com.entity.view.WenjianzhongxinView;

@Service("wenjianzhongxinService")
public class WenjianzhongxinServiceImpl extends ServiceImpl<WenjianzhongxinDao, WenjianzhongxinEntity> implements WenjianzhongxinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjianzhongxinEntity> page = this.selectPage(
                new Query<WenjianzhongxinEntity>(params).getPage(),
                new EntityWrapper<WenjianzhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjianzhongxinEntity> wrapper) {
		  Page<WenjianzhongxinView> page =new Query<WenjianzhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjianzhongxinVO> selectListVO(Wrapper<WenjianzhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjianzhongxinVO selectVO(Wrapper<WenjianzhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjianzhongxinView> selectListView(Wrapper<WenjianzhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjianzhongxinView selectView(Wrapper<WenjianzhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
