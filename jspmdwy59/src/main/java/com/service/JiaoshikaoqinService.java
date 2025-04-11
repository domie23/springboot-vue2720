package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshikaoqinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshikaoqinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshikaoqinView;


/**
 * 教师考勤
 *
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface JiaoshikaoqinService extends IService<JiaoshikaoqinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshikaoqinVO> selectListVO(Wrapper<JiaoshikaoqinEntity> wrapper);
   	
   	JiaoshikaoqinVO selectVO(@Param("ew") Wrapper<JiaoshikaoqinEntity> wrapper);
   	
   	List<JiaoshikaoqinView> selectListView(Wrapper<JiaoshikaoqinEntity> wrapper);
   	
   	JiaoshikaoqinView selectView(@Param("ew") Wrapper<JiaoshikaoqinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshikaoqinEntity> wrapper);
   	

}

