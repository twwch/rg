package com.chtw.mapper;

import com.chtw.bean.PreferentialPolicyCi;
import com.chtw.bean.PreferentialPolicyCiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreferentialPolicyCiMapper {
    int countByExample(PreferentialPolicyCiExample example);

    int deleteByExample(PreferentialPolicyCiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PreferentialPolicyCi record);

    int insertSelective(PreferentialPolicyCi record);

    List<PreferentialPolicyCi> selectByExample(PreferentialPolicyCiExample example);

    PreferentialPolicyCi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PreferentialPolicyCi record, @Param("example") PreferentialPolicyCiExample example);

    int updateByExample(@Param("record") PreferentialPolicyCi record, @Param("example") PreferentialPolicyCiExample example);

    int updateByPrimaryKeySelective(PreferentialPolicyCi record);

    int updateByPrimaryKey(PreferentialPolicyCi record);
}