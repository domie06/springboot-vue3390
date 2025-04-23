package com.entity.view;

import com.entity.GongchengdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工程订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
@TableName("gongchengdingdan")
public class GongchengdingdanView  extends GongchengdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongchengdingdanView(){
	}
 
 	public GongchengdingdanView(GongchengdingdanEntity gongchengdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, gongchengdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
