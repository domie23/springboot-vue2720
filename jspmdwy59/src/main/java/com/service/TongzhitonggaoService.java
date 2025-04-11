package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhitonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhitonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhitonggaoView;


/**
 * 通知通告
 *
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface TongzhitonggaoService extends IService<TongzhitonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhitonggaoVO> selectListVO(Wrapper<TongzhitonggaoEntity> wrapper);
   	
   	TongzhitonggaoVO selectVO(@Param("ew") Wrapper<TongzhitonggaoEntity> wrapper);
   	
   	List<TongzhitonggaoView> selectListView(Wrapper<TongzhitonggaoEntity> wrapper);
   	
   	TongzhitonggaoView selectView(@Param("ew") Wrapper<TongzhitonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhitonggaoEntity> wrapper);
   	

}

