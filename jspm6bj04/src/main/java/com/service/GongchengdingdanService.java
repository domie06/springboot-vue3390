package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongchengdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongchengdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongchengdingdanView;


/**
 * 工程订单
 *
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public interface GongchengdingdanService extends IService<GongchengdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongchengdingdanVO> selectListVO(Wrapper<GongchengdingdanEntity> wrapper);
   	
   	GongchengdingdanVO selectVO(@Param("ew") Wrapper<GongchengdingdanEntity> wrapper);
   	
   	List<GongchengdingdanView> selectListView(Wrapper<GongchengdingdanEntity> wrapper);
   	
   	GongchengdingdanView selectView(@Param("ew") Wrapper<GongchengdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongchengdingdanEntity> wrapper);
   	

}

