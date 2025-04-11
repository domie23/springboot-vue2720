package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XisuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XisuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XisuoView;


/**
 * 系所
 *
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface XisuoService extends IService<XisuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XisuoVO> selectListVO(Wrapper<XisuoEntity> wrapper);
   	
   	XisuoVO selectVO(@Param("ew") Wrapper<XisuoEntity> wrapper);
   	
   	List<XisuoView> selectListView(Wrapper<XisuoEntity> wrapper);
   	
   	XisuoView selectView(@Param("ew") Wrapper<XisuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XisuoEntity> wrapper);
   	

}

