package com.chtw.mapper;

import com.chtw.bean.IndustrialType;
import com.chtw.bean.IndustrialTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustrialTypeMapper {
    int countByExample(IndustrialTypeExample example);

    int deleteByExample(IndustrialTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustrialType record);

    int insertSelective(IndustrialType record);

    List<IndustrialType> selectByExample(IndustrialTypeExample example);

    IndustrialType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustrialType record, @Param("example") IndustrialTypeExample example);

    int updateByExample(@Param("record") IndustrialType record, @Param("example") IndustrialTypeExample example);

    int updateByPrimaryKeySelective(IndustrialType record);

    int updateByPrimaryKey(IndustrialType record);
}