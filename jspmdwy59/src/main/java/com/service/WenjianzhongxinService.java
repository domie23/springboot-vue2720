package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjianzhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjianzhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjianzhongxinView;


/**
 * 文件中心
 *
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
public interface WenjianzhongxinService extends IService<WenjianzhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjianzhongxinVO> selectListVO(Wrapper<WenjianzhongxinEntity> wrapper);
   	
   	WenjianzhongxinVO selectVO(@Param("ew") Wrapper<WenjianzhongxinEntity> wrapper);
   	
   	List<WenjianzhongxinView> selectListView(Wrapper<WenjianzhongxinEntity> wrapper);
   	
   	WenjianzhongxinView selectView(@Param("ew") Wrapper<WenjianzhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjianzhongxinEntity> wrapper);
   	

}

