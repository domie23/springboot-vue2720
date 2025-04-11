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


import com.dao.XisuoDao;
import com.entity.XisuoEntity;
import com.service.XisuoService;
import com.entity.vo.XisuoVO;
import com.entity.view.XisuoView;

@Service("xisuoService")
public class XisuoServiceImpl extends ServiceImpl<XisuoDao, XisuoEntity> implements XisuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XisuoEntity> page = this.selectPage(
                new Query<XisuoEntity>(params).getPage(),
                new EntityWrapper<XisuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XisuoEntity> wrapper) {
		  Page<XisuoView> page =new Query<XisuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XisuoVO> selectListVO(Wrapper<XisuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XisuoVO selectVO(Wrapper<XisuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XisuoView> selectListView(Wrapper<XisuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XisuoView selectView(Wrapper<XisuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
