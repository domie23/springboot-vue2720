package com.dao;

import com.entity.TongzhitonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongzhitonggaoVO;
import com.entity.view.TongzhitonggaoView;


/**
 * 通知通告
 * 
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface TongzhitonggaoDao extends BaseMapper<TongzhitonggaoEntity> {
	
	List<TongzhitonggaoVO> selectListVO(@Param("ew") Wrapper<TongzhitonggaoEntity> wrapper);
	
	TongzhitonggaoVO selectVO(@Param("ew") Wrapper<TongzhitonggaoEntity> wrapper);
	
	List<TongzhitonggaoView> selectListView(@Param("ew") Wrapper<TongzhitonggaoEntity> wrapper);

	List<TongzhitonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhitonggaoEntity> wrapper);
	
	TongzhitonggaoView selectView(@Param("ew") Wrapper<TongzhitonggaoEntity> wrapper);
	

}
