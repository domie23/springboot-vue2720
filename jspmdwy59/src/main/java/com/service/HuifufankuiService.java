package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuifufankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuifufankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuifufankuiView;


/**
 * 回复反馈
 *
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface HuifufankuiService extends IService<HuifufankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuifufankuiVO> selectListVO(Wrapper<HuifufankuiEntity> wrapper);
   	
   	HuifufankuiVO selectVO(@Param("ew") Wrapper<HuifufankuiEntity> wrapper);
   	
   	List<HuifufankuiView> selectListView(Wrapper<HuifufankuiEntity> wrapper);
   	
   	HuifufankuiView selectView(@Param("ew") Wrapper<HuifufankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuifufankuiEntity> wrapper);
   	

}

