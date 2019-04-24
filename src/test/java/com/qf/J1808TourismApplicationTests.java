package com.qf;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qf.mapper.TbStrategyMapper;
import com.qf.pojo.City;
import com.qf.pojo.TbStrategy;
import com.qf.service.CityService;
import com.qf.service.StrategyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class J1808TourismApplicationTests {
@Autowired private StrategyService ss;
@Autowired private CityService city;
	@Test
	public void contextLoads() {
		/*List<TbStrategy> queryStrategy = ss.queryStrategy();
		System.out.println(queryStrategy);*/
		City queryByName = city.queryByName("石家庄市");
		System.out.println(queryByName);
	}

}
