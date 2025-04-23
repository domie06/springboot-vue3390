package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuangxiucailiaoDao;
import com.entity.ZhuangxiucailiaoEntity;
import com.service.ZhuangxiucailiaoService;
import com.entity.vo.ZhuangxiucailiaoVO;
import com.entity.view.ZhuangxiucailiaoView;

@Service("zhuangxiucailiaoService")
public class ZhuangxiucailiaoServiceImpl extends ServiceImpl<ZhuangxiucailiaoDao, ZhuangxiucailiaoEntity> implements ZhuangxiucailiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangxiucailiaoEntity> page = this.selectPage(
                new Query<ZhuangxiucailiaoEntity>(params).getPage(),
                new EntityWrapper<ZhuangxiucailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangxiucailiaoEntity> wrapper) {
		  Page<ZhuangxiucailiaoView> page =new Query<ZhuangxiucailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuangxiucailiaoVO> selectListVO(Wrapper<ZhuangxiucailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangxiucailiaoVO selectVO(Wrapper<ZhuangxiucailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangxiucailiaoView> selectListView(Wrapper<ZhuangxiucailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangxiucailiaoView selectView(Wrapper<ZhuangxiucailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
