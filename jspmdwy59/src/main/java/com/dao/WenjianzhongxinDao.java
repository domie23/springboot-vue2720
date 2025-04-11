package com.dao;

import com.entity.WenjianzhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjianzhongxinVO;
import com.entity.view.WenjianzhongxinView;


/**
 * 文件中心
 * 
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface WenjianzhongxinDao extends BaseMapper<WenjianzhongxinEntity> {
	
	List<WenjianzhongxinVO> selectListVO(@Param("ew") Wrapper<WenjianzhongxinEntity> wrapper);
	
	WenjianzhongxinVO selectVO(@Param("ew") Wrapper<WenjianzhongxinEntity> wrapper);
	
	List<WenjianzhongxinView> selectListView(@Param("ew") Wrapper<WenjianzhongxinEntity> wrapper);

	List<WenjianzhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<WenjianzhongxinEntity> wrapper);
	
	WenjianzhongxinView selectView(@Param("ew") Wrapper<WenjianzhongxinEntity> wrapper);
	

}
