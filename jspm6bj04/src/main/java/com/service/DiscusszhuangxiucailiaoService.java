package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhuangxiucailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhuangxiucailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhuangxiucailiaoView;


/**
 * 装修材料评论表
 *
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
public interface DiscusszhuangxiucailiaoService extends IService<DiscusszhuangxiucailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhuangxiucailiaoVO> selectListVO(Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
   	
   	DiscusszhuangxiucailiaoVO selectVO(@Param("ew") Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
   	
   	List<DiscusszhuangxiucailiaoView> selectListView(Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
   	
   	DiscusszhuangxiucailiaoView selectView(@Param("ew") Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhuangxiucailiaoEntity> wrapper);
   	

}

