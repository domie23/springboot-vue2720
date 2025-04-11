package com.dao;

import com.entity.XisuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XisuoVO;
import com.entity.view.XisuoView;


/**
 * 系所
 * 
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface XisuoDao extends BaseMapper<XisuoEntity> {
	
	List<XisuoVO> selectListVO(@Param("ew") Wrapper<XisuoEntity> wrapper);
	
	XisuoVO selectVO(@Param("ew") Wrapper<XisuoEntity> wrapper);
	
	List<XisuoView> selectListView(@Param("ew") Wrapper<XisuoEntity> wrapper);

	List<XisuoView> selectListView(Pagination page,@Param("ew") Wrapper<XisuoEntity> wrapper);
	
	XisuoView selectView(@Param("ew") Wrapper<XisuoEntity> wrapper);
	

}
