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


import com.dao.GongchengdingdanDao;
import com.entity.GongchengdingdanEntity;
import com.service.GongchengdingdanService;
import com.entity.vo.GongchengdingdanVO;
import com.entity.view.GongchengdingdanView;

@Service("gongchengdingdanService")
public class GongchengdingdanServiceImpl extends ServiceImpl<GongchengdingdanDao, GongchengdingdanEntity> implements GongchengdingdanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongchengdingdanEntity> page = this.selectPage(
                new Query<GongchengdingdanEntity>(params).getPage(),
                new EntityWrapper<GongchengdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongchengdingdanEntity> wrapper) {
		  Page<GongchengdingdanView> page =new Query<GongchengdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongchengdingdanVO> selectListVO(Wrapper<GongchengdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongchengdingdanVO selectVO(Wrapper<GongchengdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongchengdingdanView> selectListView(Wrapper<GongchengdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongchengdingdanView selectView(Wrapper<GongchengdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
