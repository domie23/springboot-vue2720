package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingdaoxinxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingdaoxinxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingdaoxinxiangView;


/**
 * 领导信箱
 *
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface LingdaoxinxiangService extends IService<LingdaoxinxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingdaoxinxiangVO> selectListVO(Wrapper<LingdaoxinxiangEntity> wrapper);
   	
   	LingdaoxinxiangVO selectVO(@Param("ew") Wrapper<LingdaoxinxiangEntity> wrapper);
   	
   	List<LingdaoxinxiangView> selectListView(Wrapper<LingdaoxinxiangEntity> wrapper);
   	
   	LingdaoxinxiangView selectView(@Param("ew") Wrapper<LingdaoxinxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingdaoxinxiangEntity> wrapper);
   	

}

