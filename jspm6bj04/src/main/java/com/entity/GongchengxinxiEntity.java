package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 工程信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
@TableName("gongchengxinxi")
public class GongchengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongchengxinxiEntity() {
		
	}
	
	public GongchengxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工程名称
	 */
					
	private String gongchengmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工程名称
	 */
	public void setGongchengmingcheng(String gongchengmingcheng) {
		this.gongchengmingcheng = gongchengmingcheng;
	}
	/**
	 * 获取：工程名称
	 */
	public String getGongchengmingcheng() {
		return gongchengmingcheng;
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
