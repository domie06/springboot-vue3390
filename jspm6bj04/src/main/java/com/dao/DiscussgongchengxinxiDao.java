package com.dao;

import com.entity.DiscussgongchengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgongchengxinxiVO;
import com.entity.view.DiscussgongchengxinxiView;


/**
 * 工程信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public interface DiscussgongchengxinxiDao extends BaseMapper<DiscussgongchengxinxiEntity> {
	
	List<DiscussgongchengxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussgongchengxinxiEntity> wrapper);
	
	DiscussgongchengxinxiVO selectVO(@Param("ew") Wrapper<DiscussgongchengxinxiEntity> wrapper);
	
	List<DiscussgongchengxinxiView> selectListView(@Param("ew") Wrapper<DiscussgongchengxinxiEntity> wrapper);

	List<DiscussgongchengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgongchengxinxiEntity> wrapper);
	
	DiscussgongchengxinxiView selectView(@Param("ew") Wrapper<DiscussgongchengxinxiEntity> wrapper);
	

}
