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


import com.dao.DiscusszhuangxiucailiaoDao;
import com.entity.DiscusszhuangxiucailiaoEntity;
import com.service.DiscusszhuangxiucailiaoService;
import com.entity.vo.DiscusszhuangxiucailiaoVO;
import com.entity.view.DiscusszhuangxiucailiaoView;

@Service("discusszhuangxiucailiaoService")
public class DiscusszhuangxiucailiaoServiceImpl extends ServiceImpl<DiscusszhuangxiucailiaoDao, DiscusszhuangxiucailiaoEntity> implements DiscusszhuangxiucailiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhuangxiucailiaoEntity> page = this.selectPage(
                new Query<DiscusszhuangxiucailiaoEntity>(params).getPage(),
                new EntityWrapper<DiscusszhuangxiucailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhuangxiucailiaoEntity> wrapper) {
		  Page<DiscusszhuangxiucailiaoView> page =new Query<DiscusszhuangxiucailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhuangxiucailiaoVO> selectListVO(Wrapper<DiscusszhuangxiucailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhuangxiucailiaoVO selectVO(Wrapper<DiscusszhuangxiucailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhuangxiucailiaoView> selectListView(Wrapper<DiscusszhuangxiucailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhuangxiucailiaoView selectView(Wrapper<DiscusszhuangxiucailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
