package com.dao;

import com.entity.LingdaoxinxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingdaoxinxiangVO;
import com.entity.view.LingdaoxinxiangView;


/**
 * 领导信箱
 * 
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface LingdaoxinxiangDao extends BaseMapper<LingdaoxinxiangEntity> {
	
	List<LingdaoxinxiangVO> selectListVO(@Param("ew") Wrapper<LingdaoxinxiangEntity> wrapper);
	
	LingdaoxinxiangVO selectVO(@Param("ew") Wrapper<LingdaoxinxiangEntity> wrapper);
	
	List<LingdaoxinxiangView> selectListView(@Param("ew") Wrapper<LingdaoxinxiangEntity> wrapper);

	List<LingdaoxinxiangView> selectListView(Pagination page,@Param("ew") Wrapper<LingdaoxinxiangEntity> wrapper);
	
	LingdaoxinxiangView selectView(@Param("ew") Wrapper<LingdaoxinxiangEntity> wrapper);
	

}
