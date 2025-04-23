package com.entity.vo;

import com.entity.ZhuangxiucailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 装修材料
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-22 23:08:12
 */
public class ZhuangxiucailiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料名称
	 */
	
	private String cailiaomingcheng;
		
	/**
	 * 材料分类
	 */
	
	private String cailiaofenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 单位
	 */
	
	private String danwei;
		
	/**
	 * 材料介绍
	 */
	
	private String cailiaojieshao;
				
	
	/**
	 * 设置：材料名称
	 */
	 
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
	}
				
	
	/**
	 * 设置：材料分类
	 */
	 
	public void setCailiaofenlei(String cailiaofenlei) {
		this.cailiaofenlei = cailiaofenlei;
	}
	
	/**
	 * 获取：材料分类
	 */
	public String getCailiaofenlei() {
		return cailiaofenlei;
	}
				
	
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
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：单位
	 */
	 
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	
	/**
	 * 获取：单位
	 */
	public String getDanwei() {
		return danwei;
	}
				
	
	/**
	 * 设置：材料介绍
	 */
	 
	public void setCailiaojieshao(String cailiaojieshao) {
		this.cailiaojieshao = cailiaojieshao;
	}
	
	/**
	 * 获取：材料介绍
	 */
	public String getCailiaojieshao() {
		return cailiaojieshao;
	}
			
}
