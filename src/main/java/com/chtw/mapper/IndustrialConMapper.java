package com.chtw.mapper;

import com.chtw.bean.IndustrialCon;
import com.chtw.bean.IndustrialConExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustrialConMapper {
    int countByExample(IndustrialConExample example);

    int deleteByExample(IndustrialConExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustrialCon record);

    int insertSelective(IndustrialCon record);

    List<IndustrialCon> selectByExample(IndustrialConExample example);

    IndustrialCon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustrialCon record, @Param("example") IndustrialConExample example);

    int updateByExample(@Param("record") IndustrialCon record, @Param("example") IndustrialConExample example);

    int updateByPrimaryKeySelective(IndustrialCon record);

    int updateByPrimaryKey(IndustrialCon record);
}