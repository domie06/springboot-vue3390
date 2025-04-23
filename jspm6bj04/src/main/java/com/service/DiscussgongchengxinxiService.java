package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgongchengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgongchengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgongchengxinxiView;


/**
 * 工程信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public interface DiscussgongchengxinxiService extends IService<DiscussgongchengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgongchengxinxiVO> selectListVO(Wrapper<DiscussgongchengxinxiEntity> wrapper);
   	
   	DiscussgongchengxinxiVO selectVO(@Param("ew") Wrapper<DiscussgongchengxinxiEntity> wrapper);
   	
   	List<DiscussgongchengxinxiView> selectListView(Wrapper<DiscussgongchengxinxiEntity> wrapper);
   	
   	DiscussgongchengxinxiView selectView(@Param("ew") Wrapper<DiscussgongchengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgongchengxinxiEntity> wrapper);
   	

}

