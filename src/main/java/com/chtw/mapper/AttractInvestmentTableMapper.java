package com.chtw.mapper;

import com.chtw.bean.AttractInvestmentTable;
import com.chtw.bean.AttractInvestmentTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttractInvestmentTableMapper {
    int countByExample(AttractInvestmentTableExample example);

    int deleteByExample(AttractInvestmentTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttractInvestmentTable record);

    int insertSelective(AttractInvestmentTable record);

    List<AttractInvestmentTable> selectByExample(AttractInvestmentTableExample example);

    AttractInvestmentTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttractInvestmentTable record, @Param("example") AttractInvestmentTableExample example);

    int updateByExample(@Param("record") AttractInvestmentTable record, @Param("example") AttractInvestmentTableExample example);

    int updateByPrimaryKeySelective(AttractInvestmentTable record);

    int updateByPrimaryKey(AttractInvestmentTable record);
}