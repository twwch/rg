package com.chtw.mapper;

import com.chtw.bean.InvestmentServicesCi;
import com.chtw.bean.InvestmentServicesCiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestmentServicesCiMapper {
    int countByExample(InvestmentServicesCiExample example);

    int deleteByExample(InvestmentServicesCiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvestmentServicesCi record);

    int insertSelective(InvestmentServicesCi record);

    List<InvestmentServicesCi> selectByExample(InvestmentServicesCiExample example);

    InvestmentServicesCi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvestmentServicesCi record, @Param("example") InvestmentServicesCiExample example);

    int updateByExample(@Param("record") InvestmentServicesCi record, @Param("example") InvestmentServicesCiExample example);

    int updateByPrimaryKeySelective(InvestmentServicesCi record);

    int updateByPrimaryKey(InvestmentServicesCi record);
}