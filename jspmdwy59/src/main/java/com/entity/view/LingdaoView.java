package com.entity.view;

import com.entity.LingdaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领导
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
@TableName("lingdao")
public class LingdaoView  extends LingdaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingdaoView(){
	}
 
 	public LingdaoView(LingdaoEntity lingdaoEntity){
 	try {
			BeanUtils.copyProperties(this, lingdaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
