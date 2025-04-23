package com.dao;

import com.entity.GongchengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongchengxinxiVO;
import com.entity.view.GongchengxinxiView;


/**
 * 工程信息
 * 
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public interface GongchengxinxiDao extends BaseMapper<GongchengxinxiEntity> {
	
	List<GongchengxinxiVO> selectListVO(@Param("ew") Wrapper<GongchengxinxiEntity> wrapper);
	
	GongchengxinxiVO selectVO(@Param("ew") Wrapper<GongchengxinxiEntity> wrapper);
	
	List<GongchengxinxiView> selectListView(@Param("ew") Wrapper<GongchengxinxiEntity> wrapper);

	List<GongchengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongchengxinxiEntity> wrapper);
	
	GongchengxinxiView selectView(@Param("ew") Wrapper<GongchengxinxiEntity> wrapper);
	

}
