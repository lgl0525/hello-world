package com.qf.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.qf.pojo.City;
import com.qf.pojo.TbStrategy;
import com.qf.service.CityService;
import com.qf.service.StrategyService;
import com.qf.vo.MsgResult;
import com.qf.vo.StrategyVo;

@Controller
public class StrategyController {

	@Autowired private StrategyService ss;
	@Autowired private CityService cityService;
	@RequestMapping("/admin/strategy_add")
	public String strategy_add(){
		
		return "admin/strategy_add";
	}
	
	@RequestMapping("admin/strategy_list")
	public String strategy_list(){

		return "admin/strategy_list";
	}
	
	@RequestMapping("html/strategy/strategy")
	public String strategy(Model model){
		List<TbStrategy> queryStrategy = ss.queryStrategy();
		model.addAttribute("stratefy", queryStrategy);
		return "html/strategy/strategy";
	}
	@RequestMapping("/html/strategy_detail")
	public String strategy_detail(BigDecimal strId,Model model){
		TbStrategy queryStrategyId = ss.queryStrategyId(strId);
		model.addAttribute("stratefys", queryStrategyId);
		String chengshi = queryStrategyId.getChengshi();
		City queryByName = cityService.queryByName(chengshi);
		model.addAttribute("chengshi", queryByName);
		return "html/strategy/strategy_detail";
	}
	@RequestMapping("admin/strategy_edit")
	public String strategy_edit(BigDecimal StrId,Model model){
		TbStrategy queryStrategyId = ss.queryStrategyId(StrId);
		model.addAttribute("strategy", queryStrategyId);
		System.out.println(queryStrategyId);
		return "admin/strategy_edit";
	}
	
/*	@RequestMapping("geTbStrategies")
	@ResponseBody
	public List<TbStrategy> geTbStrategies(){
		List<TbStrategy> queryStrategy = ss.queryStrategy();
		return queryStrategy;
	}
	
	@RequestMapping("geTbStrategiesById")
	@ResponseBody
	public TbStrategy geTbStrategiesById(@RequestParam("id") BigDecimal id){
		System.out.println(id);
		TbStrategy queryStrategyId = ss.queryStrategyId(id);
		return queryStrategyId;
	}*/
	
	//发布攻略
	@RequestMapping(value="admin/addStrategies",method=RequestMethod.POST)
	@ResponseBody
	public MsgResult addStrategies(StrategyVo strategyVo){
		System.out.println(strategyVo);
		boolean addStrategy = ss.addStrategy(strategyVo);
		MsgResult msg=new MsgResult();	
		if(addStrategy){
			msg.setStatus(200);
			msg.setMessage("发布成功");
		}		
		return msg;
	}
	
	//修改攻略
	@RequestMapping(value="admin/updateStrategies",method=RequestMethod.POST)
	@ResponseBody
	public MsgResult updateStrategies(StrategyVo strategyVo,@RequestParam("id") BigDecimal id){
		System.out.println(id);
		System.out.println(strategyVo);
		boolean updateStrategy = ss.updateStrategy(strategyVo, id);
		MsgResult msg=new MsgResult();	
		if(updateStrategy){
			msg.setStatus(200);
			msg.setMessage("发布成功");
		}		
		return msg;
	}
	
	//删除攻略
	@RequestMapping(value="admin/deleteStrategiesById")
	@ResponseBody
	public MsgResult deleteStrategiesById(@RequestParam("id") BigDecimal id){
		boolean deleteStrategy = ss.deleteStrategy(id);
		MsgResult msg=new MsgResult();	
		if(deleteStrategy){
			msg.setStatus(200);
			msg.setMessage("删除成功");
		}	
		return msg;
	}
}
