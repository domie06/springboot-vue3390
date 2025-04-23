package com.entity.model;

import com.entity.GongchengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 工程信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public class GongchengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 工程面积
	 */
	
	private String gongchengmianji;
		
	/**
	 * 装修建材
	 */
	
	private String zhuangxiujiancai;
		
	/**
	 * 工程介绍
	 */
	
	private String gongchengjieshao;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：工程面积
	 */
	 
	public void setGongchengmianji(String gongchengmianji) {
		this.gongchengmianji = gongchengmianji;
	}
	
	/**
	 * 获取：工程面积
	 */
	public String getGongchengmianji() {
		return gongchengmianji;
	}
				
	
	/**
	 * 设置：装修建材
	 */
	 
	public void setZhuangxiujiancai(String zhuangxiujiancai) {
		this.zhuangxiujiancai = zhuangxiujiancai;
	}
	
	/**
	 * 获取：装修建材
	 */
	public String getZhuangxiujiancai() {
		return zhuangxiujiancai;
	}
				
	
	/**
	 * 设置：工程介绍
	 */
	 
	public void setGongchengjieshao(String gongchengjieshao) {
		this.gongchengjieshao = gongchengjieshao;
	}
	
	/**
	 * 获取：工程介绍
	 */
	public String getGongchengjieshao() {
		return gongchengjieshao;
	}
			
}
