package com.qf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.mapper.CityMapper;
import com.qf.pojo.City;
import com.qf.pojo.CityExample;
import com.qf.pojo.CityExample.Criteria;
import com.qf.service.CityService;
@Service
public class CityServiceImpl implements CityService {

	@Autowired private CityMapper cityMapper;
	@Override
	public City queryByName(String name) {
		CityExample example1=new CityExample();
		// TODO Auto-generated method stub
		Criteria createCriteria = example1.createCriteria();
		Criteria andCityNameEqualTo = createCriteria.andCityNameEqualTo(name);
		City selectByExample = cityMapper.selectByExample(example1);
		return selectByExample;
	}

}
