package com.chtw.mapper;

import com.chtw.bean.PreferentialPolicy;
import com.chtw.bean.PreferentialPolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreferentialPolicyMapper {
    int countByExample(PreferentialPolicyExample example);

    int deleteByExample(PreferentialPolicyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PreferentialPolicy record);

    int insertSelective(PreferentialPolicy record);

    List<PreferentialPolicy> selectByExample(PreferentialPolicyExample example);

    PreferentialPolicy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PreferentialPolicy record, @Param("example") PreferentialPolicyExample example);

    int updateByExample(@Param("record") PreferentialPolicy record, @Param("example") PreferentialPolicyExample example);

    int updateByPrimaryKeySelective(PreferentialPolicy record);

    int updateByPrimaryKey(PreferentialPolicy record);
}