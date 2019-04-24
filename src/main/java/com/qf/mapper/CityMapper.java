package com.qf.mapper;

import com.qf.pojo.City;
import com.qf.pojo.CityExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    int countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(BigDecimal cityId);

    int insert(City record);

    int insertSelective(City record);

    City selectByExample(CityExample example);

    City selectByPrimaryKey(BigDecimal cityId);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
    
}