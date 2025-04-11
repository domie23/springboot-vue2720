package com.dao;

import com.entity.JiaoshikaoqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshikaoqinVO;
import com.entity.view.JiaoshikaoqinView;


/**
 * 教师考勤
 * 
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface JiaoshikaoqinDao extends BaseMapper<JiaoshikaoqinEntity> {
	
	List<JiaoshikaoqinVO> selectListVO(@Param("ew") Wrapper<JiaoshikaoqinEntity> wrapper);
	
	JiaoshikaoqinVO selectVO(@Param("ew") Wrapper<JiaoshikaoqinEntity> wrapper);
	
	List<JiaoshikaoqinView> selectListView(@Param("ew") Wrapper<JiaoshikaoqinEntity> wrapper);

	List<JiaoshikaoqinView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshikaoqinEntity> wrapper);
	
	JiaoshikaoqinView selectView(@Param("ew") Wrapper<JiaoshikaoqinEntity> wrapper);
	

}
