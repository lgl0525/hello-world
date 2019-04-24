package com.qf.service;

import java.math.BigDecimal;
import java.util.List;

import com.qf.pojo.TbStrategy;
import com.qf.vo.StrategyVo;

public interface StrategyService {

	public TbStrategy queryStrategyId(BigDecimal id);
	
	public List<TbStrategy> queryStrategy();
	
	public boolean addStrategy(StrategyVo strategyVo);
	
	public boolean updateStrategy(StrategyVo strategyVo,BigDecimal id);
	
	public boolean deleteStrategy(BigDecimal id);
}
