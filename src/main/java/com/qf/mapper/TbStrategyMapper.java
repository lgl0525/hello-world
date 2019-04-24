package com.qf.mapper;

import com.qf.pojo.TbStrategy;
import com.qf.pojo.TbStrategyExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStrategyMapper {
    int countByExample(TbStrategyExample example);

    int deleteByExample(TbStrategyExample example);

    int deleteByPrimaryKey(BigDecimal strId);

    int insert(TbStrategy record);

    int insertSelective(TbStrategy record);

    List<TbStrategy> selectByExample(TbStrategyExample example);

    TbStrategy selectByPrimaryKey(BigDecimal strId);

    int updateByExampleSelective(@Param("record") TbStrategy record, @Param("example") TbStrategyExample example);

    int updateByExample(@Param("record") TbStrategy record, @Param("example") TbStrategyExample example);

    int updateByPrimaryKeySelective(TbStrategy record);

    int updateByPrimaryKey(TbStrategy record);
}