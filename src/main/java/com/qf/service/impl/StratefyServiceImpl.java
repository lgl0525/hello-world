package com.qf.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.mapper.TbStrategyMapper;
import com.qf.pojo.TbStrategy;
import com.qf.pojo.TbStrategyExample;
import com.qf.service.StrategyService;
import com.qf.vo.StrategyVo;
@Service
public class StratefyServiceImpl implements StrategyService {
@Autowired private TbStrategyMapper sm;

	@Override
	public TbStrategy queryStrategyId(BigDecimal id) {
		// TODO Auto-generated method stub
		TbStrategy strategy = sm.selectByPrimaryKey(id);
		return strategy;
	}
	@Override
	public List<TbStrategy> queryStrategy() {
		// TODO Auto-generated method stub
		TbStrategyExample example=new TbStrategyExample();
		List<TbStrategy> selectByExample = sm.selectByExample(example);
		return selectByExample;
	}
	@Override
	public boolean addStrategy(StrategyVo strategyVo) {
		// TODO Auto-generated method stub
		TbStrategy tstr=new TbStrategy();
		tstr.setAppropriateCrowd(strategyVo.getAppropriateCrowd());
		tstr.setAppropriateTime(strategyVo.getAppropriateTime());
		tstr.setChengshi(strategyVo.getChengshi());
		tstr.setFaburen(strategyVo.getFaburen());
		tstr.setFabutime(strategyVo.getFabuTime());
		tstr.setImg(strategyVo.getImgUrl());
		tstr.setMattersNeedAttention(strategyVo.getMattersNeedAttention());
		tstr.setNecessaryEquipment(strategyVo.getNecessaryEquipment());
		tstr.setParticulars(strategyVo.getParticulars());
		tstr.setScenicSpot(strategyVo.getScenicSpot());
		tstr.setStrTitle(strategyVo.getStrTitle());
		tstr.setType(strategyVo.getType());
		int insert = sm.insert(tstr);
		  if(insert>=1){
			  return true;
		  }
		return false;
	}
	@Override
	public boolean updateStrategy(StrategyVo strategyVo, BigDecimal id) {
		// TODO Auto-generated method stub
		TbStrategy tstr=new TbStrategy();
		tstr.setAppropriateCrowd(strategyVo.getAppropriateCrowd());
		tstr.setAppropriateTime(strategyVo.getAppropriateTime());
		tstr.setChengshi(strategyVo.getChengshi());
		tstr.setFaburen(strategyVo.getFaburen());
		tstr.setFabutime(strategyVo.getFabuTime());
		tstr.setImg(strategyVo.getImgUrl());
		tstr.setMattersNeedAttention(strategyVo.getMattersNeedAttention());
		tstr.setNecessaryEquipment(strategyVo.getNecessaryEquipment());
		tstr.setParticulars(strategyVo.getParticulars());
		tstr.setScenicSpot(strategyVo.getScenicSpot());
		tstr.setStrTitle(strategyVo.getStrTitle());
		tstr.setType(strategyVo.getType());
		tstr.setStrId(id);
		int updateByPrimaryKeySelective = sm.updateByPrimaryKeySelective(tstr);
		if(updateByPrimaryKeySelective>=1){
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteStrategy(BigDecimal id) {
		// TODO Auto-generated method stub
		int deleteByPrimaryKey = sm.deleteByPrimaryKey(id);
		if(deleteByPrimaryKey>=1){
			return true;
		}
		return false;
	}

}
