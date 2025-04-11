package com.entity.view;

import com.entity.LingdaoxinxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领导信箱
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
@TableName("lingdaoxinxiang")
public class LingdaoxinxiangView  extends LingdaoxinxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingdaoxinxiangView(){
	}
 
 	public LingdaoxinxiangView(LingdaoxinxiangEntity lingdaoxinxiangEntity){
 	try {
			BeanUtils.copyProperties(this, lingdaoxinxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
