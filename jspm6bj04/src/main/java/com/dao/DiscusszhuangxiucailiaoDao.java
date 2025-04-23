package com.dao;

import com.entity.DiscusszhuangxiucailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhuangxiucailiaoVO;
import com.entity.view.DiscusszhuangxiucailiaoView;


/**
 * 装修材料评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public interface DiscusszhuangxiucailiaoDao extends BaseMapper<DiscusszhuangxiucailiaoEntity> {
	
	List<DiscusszhuangxiucailiaoVO> selectListVO(@Param("ew") Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
	
	DiscusszhuangxiucailiaoVO selectVO(@Param("ew") Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
	
	List<DiscusszhuangxiucailiaoView> selectListView(@Param("ew") Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);

	List<DiscusszhuangxiucailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
	
	DiscusszhuangxiucailiaoView selectView(@Param("ew") Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
	

}
