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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LingdaoxinxiangEntity;
import com.entity.view.LingdaoxinxiangView;

import com.service.LingdaoxinxiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 领导信箱
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-22 17:20:21
 */
@RestController
@RequestMapping("/lingdaoxinxiang")
public class LingdaoxinxiangController {
    @Autowired
    private LingdaoxinxiangService lingdaoxinxiangService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LingdaoxinxiangEntity lingdaoxinxiang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("lingdao")) {
			lingdaoxinxiang.setLingdaozhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			lingdaoxinxiang.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LingdaoxinxiangEntity> ew = new EntityWrapper<LingdaoxinxiangEntity>();
    	PageUtils page = lingdaoxinxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingdaoxinxiang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LingdaoxinxiangEntity lingdaoxinxiang, 
		HttpServletRequest request){
        EntityWrapper<LingdaoxinxiangEntity> ew = new EntityWrapper<LingdaoxinxiangEntity>();
    	PageUtils page = lingdaoxinxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingdaoxinxiang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LingdaoxinxiangEntity lingdaoxinxiang){
       	EntityWrapper<LingdaoxinxiangEntity> ew = new EntityWrapper<LingdaoxinxiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lingdaoxinxiang, "lingdaoxinxiang")); 
        return R.ok().put("data", lingdaoxinxiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LingdaoxinxiangEntity lingdaoxinxiang){
        EntityWrapper< LingdaoxinxiangEntity> ew = new EntityWrapper< LingdaoxinxiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lingdaoxinxiang, "lingdaoxinxiang")); 
		LingdaoxinxiangView lingdaoxinxiangView =  lingdaoxinxiangService.selectView(ew);
		return R.ok("查询领导信箱成功").put("data", lingdaoxinxiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LingdaoxinxiangEntity lingdaoxinxiang = lingdaoxinxiangService.selectById(id);
        return R.ok().put("data", lingdaoxinxiang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LingdaoxinxiangEntity lingdaoxinxiang = lingdaoxinxiangService.selectById(id);
        return R.ok().put("data", lingdaoxinxiang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LingdaoxinxiangEntity lingdaoxinxiang, HttpServletRequest request){
    	lingdaoxinxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingdaoxinxiang);

        lingdaoxinxiangService.insert(lingdaoxinxiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LingdaoxinxiangEntity lingdaoxinxiang, HttpServletRequest request){
    	lingdaoxinxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingdaoxinxiang);

        lingdaoxinxiangService.insert(lingdaoxinxiang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LingdaoxinxiangEntity lingdaoxinxiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lingdaoxinxiang);
        lingdaoxinxiangService.updateById(lingdaoxinxiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lingdaoxinxiangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<LingdaoxinxiangEntity> wrapper = new EntityWrapper<LingdaoxinxiangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("lingdao")) {
			wrapper.eq("lingdaozhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = lingdaoxinxiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
