package com.entity.view;

import com.entity.DiscusszhuangxiucailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 装修材料评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
@TableName("discusszhuangxiucailiao")
public class DiscusszhuangxiucailiaoView  extends DiscusszhuangxiucailiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhuangxiucailiaoView(){
	}
 
 	public DiscusszhuangxiucailiaoView(DiscusszhuangxiucailiaoEntity discusszhuangxiucailiaoEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhuangxiucailiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
