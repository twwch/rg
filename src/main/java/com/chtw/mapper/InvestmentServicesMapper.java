package com.chtw.mapper;

import com.chtw.bean.InvestmentServices;
import com.chtw.bean.InvestmentServicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestmentServicesMapper {
    int countByExample(InvestmentServicesExample example);

    int deleteByExample(InvestmentServicesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvestmentServices record);

    int insertSelective(InvestmentServices record);

    List<InvestmentServices> selectByExample(InvestmentServicesExample example);

    InvestmentServices selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvestmentServices record, @Param("example") InvestmentServicesExample example);

    int updateByExample(@Param("record") InvestmentServices record, @Param("example") InvestmentServicesExample example);

    int updateByPrimaryKeySelective(InvestmentServices record);

    int updateByPrimaryKey(InvestmentServices record);
}