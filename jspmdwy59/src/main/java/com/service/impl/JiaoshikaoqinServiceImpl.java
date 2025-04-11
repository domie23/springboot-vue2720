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


import com.dao.JiaoshikaoqinDao;
import com.entity.JiaoshikaoqinEntity;
import com.service.JiaoshikaoqinService;
import com.entity.vo.JiaoshikaoqinVO;
import com.entity.view.JiaoshikaoqinView;

@Service("jiaoshikaoqinService")
public class JiaoshikaoqinServiceImpl extends ServiceImpl<JiaoshikaoqinDao, JiaoshikaoqinEntity> implements JiaoshikaoqinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshikaoqinEntity> page = this.selectPage(
                new Query<JiaoshikaoqinEntity>(params).getPage(),
                new EntityWrapper<JiaoshikaoqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshikaoqinEntity> wrapper) {
		  Page<JiaoshikaoqinView> page =new Query<JiaoshikaoqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshikaoqinVO> selectListVO(Wrapper<JiaoshikaoqinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshikaoqinVO selectVO(Wrapper<JiaoshikaoqinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshikaoqinView> selectListView(Wrapper<JiaoshikaoqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshikaoqinView selectView(Wrapper<JiaoshikaoqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
