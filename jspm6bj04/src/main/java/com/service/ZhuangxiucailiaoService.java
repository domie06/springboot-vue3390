package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangxiucailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangxiucailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiucailiaoView;


/**
 * 装修材料
 *
 * @author 
 * @email 
 * @date 2022-04-22 23:08:12
 */
public interface ZhuangxiucailiaoService extends IService<ZhuangxiucailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangxiucailiaoVO> selectListVO(Wrapper<ZhuangxiucailiaoEntity> wrapper);
   	
   	ZhuangxiucailiaoVO selectVO(@Param("ew") Wrapper<ZhuangxiucailiaoEntity> wrapper);
   	
   	List<ZhuangxiucailiaoView> selectListView(Wrapper<ZhuangxiucailiaoEntity> wrapper);
   	
   	ZhuangxiucailiaoView selectView(@Param("ew") Wrapper<ZhuangxiucailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangxiucailiaoEntity> wrapper);
   	

}

