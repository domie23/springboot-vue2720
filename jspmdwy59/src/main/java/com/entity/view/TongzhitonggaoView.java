package com.entity.view;

import com.entity.TongzhitonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 通知通告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
@TableName("tongzhitonggao")
public class TongzhitonggaoView  extends TongzhitonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongzhitonggaoView(){
	}
 
 	public TongzhitonggaoView(TongzhitonggaoEntity tongzhitonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, tongzhitonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
