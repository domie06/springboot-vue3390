package com.entity.view;

import com.entity.ZhuangxiucailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 装修材料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 23:08:12
 */
@TableName("zhuangxiucailiao")
public class ZhuangxiucailiaoView  extends ZhuangxiucailiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuangxiucailiaoView(){
	}
 
 	public ZhuangxiucailiaoView(ZhuangxiucailiaoEntity zhuangxiucailiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhuangxiucailiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
