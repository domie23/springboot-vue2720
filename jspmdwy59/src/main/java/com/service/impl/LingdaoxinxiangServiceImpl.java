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


import com.dao.LingdaoxinxiangDao;
import com.entity.LingdaoxinxiangEntity;
import com.service.LingdaoxinxiangService;
import com.entity.vo.LingdaoxinxiangVO;
import com.entity.view.LingdaoxinxiangView;

@Service("lingdaoxinxiangService")
public class LingdaoxinxiangServiceImpl extends ServiceImpl<LingdaoxinxiangDao, LingdaoxinxiangEntity> implements LingdaoxinxiangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingdaoxinxiangEntity> page = this.selectPage(
                new Query<LingdaoxinxiangEntity>(params).getPage(),
                new EntityWrapper<LingdaoxinxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingdaoxinxiangEntity> wrapper) {
		  Page<LingdaoxinxiangView> page =new Query<LingdaoxinxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingdaoxinxiangVO> selectListVO(Wrapper<LingdaoxinxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingdaoxinxiangVO selectVO(Wrapper<LingdaoxinxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingdaoxinxiangView> selectListView(Wrapper<LingdaoxinxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingdaoxinxiangView selectView(Wrapper<LingdaoxinxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
