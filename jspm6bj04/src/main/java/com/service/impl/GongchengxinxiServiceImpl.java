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


import com.dao.GongchengxinxiDao;
import com.entity.GongchengxinxiEntity;
import com.service.GongchengxinxiService;
import com.entity.vo.GongchengxinxiVO;
import com.entity.view.GongchengxinxiView;

@Service("gongchengxinxiService")
public class GongchengxinxiServiceImpl extends ServiceImpl<GongchengxinxiDao, GongchengxinxiEntity> implements GongchengxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongchengxinxiEntity> page = this.selectPage(
                new Query<GongchengxinxiEntity>(params).getPage(),
                new EntityWrapper<GongchengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongchengxinxiEntity> wrapper) {
		  Page<GongchengxinxiView> page =new Query<GongchengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongchengxinxiVO> selectListVO(Wrapper<GongchengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongchengxinxiVO selectVO(Wrapper<GongchengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongchengxinxiView> selectListView(Wrapper<GongchengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongchengxinxiView selectView(Wrapper<GongchengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
