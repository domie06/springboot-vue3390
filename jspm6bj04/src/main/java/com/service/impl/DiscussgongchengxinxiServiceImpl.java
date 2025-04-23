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


import com.dao.DiscussgongchengxinxiDao;
import com.entity.DiscussgongchengxinxiEntity;
import com.service.DiscussgongchengxinxiService;
import com.entity.vo.DiscussgongchengxinxiVO;
import com.entity.view.DiscussgongchengxinxiView;

@Service("discussgongchengxinxiService")
public class DiscussgongchengxinxiServiceImpl extends ServiceImpl<DiscussgongchengxinxiDao, DiscussgongchengxinxiEntity> implements DiscussgongchengxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgongchengxinxiEntity> page = this.selectPage(
                new Query<DiscussgongchengxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgongchengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgongchengxinxiEntity> wrapper) {
		  Page<DiscussgongchengxinxiView> page =new Query<DiscussgongchengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgongchengxinxiVO> selectListVO(Wrapper<DiscussgongchengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgongchengxinxiVO selectVO(Wrapper<DiscussgongchengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgongchengxinxiView> selectListView(Wrapper<DiscussgongchengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgongchengxinxiView selectView(Wrapper<DiscussgongchengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
