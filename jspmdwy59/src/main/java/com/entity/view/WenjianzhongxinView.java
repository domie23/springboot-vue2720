package com.entity.view;

import com.entity.WenjianzhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文件中心
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
@TableName("wenjianzhongxin")
public class WenjianzhongxinView  extends WenjianzhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenjianzhongxinView(){
	}
 
 	public WenjianzhongxinView(WenjianzhongxinEntity wenjianzhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, wenjianzhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
