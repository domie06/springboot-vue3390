package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusszhuangxiucailiaoEntity;
import com.entity.view.DiscusszhuangxiucailiaoView;

import com.service.DiscusszhuangxiucailiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 装修材料评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-22 23:08:13
 */
@RestController
@RequestMapping("/discusszhuangxiucailiao")
public class DiscusszhuangxiucailiaoController {
    @Autowired
    private DiscusszhuangxiucailiaoService discusszhuangxiucailiaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao, 
		HttpServletRequest request){

        EntityWrapper<DiscusszhuangxiucailiaoEntity> ew = new EntityWrapper<DiscusszhuangxiucailiaoEntity>();
    	PageUtils page = discusszhuangxiucailiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhuangxiucailiao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao, 
		HttpServletRequest request){
        EntityWrapper<DiscusszhuangxiucailiaoEntity> ew = new EntityWrapper<DiscusszhuangxiucailiaoEntity>();
    	PageUtils page = discusszhuangxiucailiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhuangxiucailiao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao){
       	EntityWrapper<DiscusszhuangxiucailiaoEntity> ew = new EntityWrapper<DiscusszhuangxiucailiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusszhuangxiucailiao, "discusszhuangxiucailiao")); 
        return R.ok().put("data", discusszhuangxiucailiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao){
        EntityWrapper< DiscusszhuangxiucailiaoEntity> ew = new EntityWrapper< DiscusszhuangxiucailiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusszhuangxiucailiao, "discusszhuangxiucailiao")); 
		DiscusszhuangxiucailiaoView discusszhuangxiucailiaoView =  discusszhuangxiucailiaoService.selectView(ew);
		return R.ok("查询装修材料评论表成功").put("data", discusszhuangxiucailiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao = discusszhuangxiucailiaoService.selectById(id);
        return R.ok().put("data", discusszhuangxiucailiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao = discusszhuangxiucailiaoService.selectById(id);
        return R.ok().put("data", discusszhuangxiucailiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao, HttpServletRequest request){
    	discusszhuangxiucailiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusszhuangxiucailiao);

        discusszhuangxiucailiaoService.insert(discusszhuangxiucailiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao, HttpServletRequest request){
    	discusszhuangxiucailiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusszhuangxiucailiao);

        discusszhuangxiucailiaoService.insert(discusszhuangxiucailiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscusszhuangxiucailiaoEntity discusszhuangxiucailiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusszhuangxiucailiao);
        discusszhuangxiucailiaoService.updateById(discusszhuangxiucailiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusszhuangxiucailiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusszhuangxiucailiaoEntity> wrapper = new EntityWrapper<DiscusszhuangxiucailiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusszhuangxiucailiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
