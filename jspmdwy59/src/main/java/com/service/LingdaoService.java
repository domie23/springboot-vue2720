package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingdaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingdaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingdaoView;


/**
 * 领导
 *
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface LingdaoService extends IService<LingdaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingdaoVO> selectListVO(Wrapper<LingdaoEntity> wrapper);
   	
   	LingdaoVO selectVO(@Param("ew") Wrapper<LingdaoEntity> wrapper);
   	
   	List<LingdaoView> selectListView(Wrapper<LingdaoEntity> wrapper);
   	
   	LingdaoView selectView(@Param("ew") Wrapper<LingdaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingdaoEntity> wrapper);
   	

}

