package com.dao;

import com.entity.GongchengdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongchengdingdanVO;
import com.entity.view.GongchengdingdanView;


/**
 * 工程订单
 * 
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public interface GongchengdingdanDao extends BaseMapper<GongchengdingdanEntity> {
	
	List<GongchengdingdanVO> selectListVO(@Param("ew") Wrapper<GongchengdingdanEntity> wrapper);
	
	GongchengdingdanVO selectVO(@Param("ew") Wrapper<GongchengdingdanEntity> wrapper);
	
	List<GongchengdingdanView> selectListView(@Param("ew") Wrapper<GongchengdingdanEntity> wrapper);

	List<GongchengdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<GongchengdingdanEntity> wrapper);
	
	GongchengdingdanView selectView(@Param("ew") Wrapper<GongchengdingdanEntity> wrapper);
	

}
