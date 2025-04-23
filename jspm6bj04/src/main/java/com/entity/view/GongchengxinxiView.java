package com.entity.view;

import com.entity.GongchengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工程信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
@TableName("gongchengxinxi")
public class GongchengxinxiView  extends GongchengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongchengxinxiView(){
	}
 
 	public GongchengxinxiView(GongchengxinxiEntity gongchengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gongchengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
