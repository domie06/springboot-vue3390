package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongchengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongchengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongchengxinxiView;


/**
 * 工程信息
 *
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public interface GongchengxinxiService extends IService<GongchengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongchengxinxiVO> selectListVO(Wrapper<GongchengxinxiEntity> wrapper);
   	
   	GongchengxinxiVO selectVO(@Param("ew") Wrapper<GongchengxinxiEntity> wrapper);
   	
   	List<GongchengxinxiView> selectListView(Wrapper<GongchengxinxiEntity> wrapper);
   	
   	GongchengxinxiView selectView(@Param("ew") Wrapper<GongchengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongchengxinxiEntity> wrapper);
   	

}

