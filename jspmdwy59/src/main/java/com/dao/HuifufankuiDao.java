package com.dao;

import com.entity.HuifufankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuifufankuiVO;
import com.entity.view.HuifufankuiView;


/**
 * 回复反馈
 * 
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface HuifufankuiDao extends BaseMapper<HuifufankuiEntity> {
	
	List<HuifufankuiVO> selectListVO(@Param("ew") Wrapper<HuifufankuiEntity> wrapper);
	
	HuifufankuiVO selectVO(@Param("ew") Wrapper<HuifufankuiEntity> wrapper);
	
	List<HuifufankuiView> selectListView(@Param("ew") Wrapper<HuifufankuiEntity> wrapper);

	List<HuifufankuiView> selectListView(Pagination page,@Param("ew") Wrapper<HuifufankuiEntity> wrapper);
	
	HuifufankuiView selectView(@Param("ew") Wrapper<HuifufankuiEntity> wrapper);
	

}
