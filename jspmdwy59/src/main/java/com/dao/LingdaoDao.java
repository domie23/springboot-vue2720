package com.dao;

import com.entity.LingdaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingdaoVO;
import com.entity.view.LingdaoView;


/**
 * 领导
 * 
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface LingdaoDao extends BaseMapper<LingdaoEntity> {
	
	List<LingdaoVO> selectListVO(@Param("ew") Wrapper<LingdaoEntity> wrapper);
	
	LingdaoVO selectVO(@Param("ew") Wrapper<LingdaoEntity> wrapper);
	
	List<LingdaoView> selectListView(@Param("ew") Wrapper<LingdaoEntity> wrapper);

	List<LingdaoView> selectListView(Pagination page,@Param("ew") Wrapper<LingdaoEntity> wrapper);
	
	LingdaoView selectView(@Param("ew") Wrapper<LingdaoEntity> wrapper);
	

}
