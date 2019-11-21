package com.chtw.mapper;

import com.chtw.bean.IndustryInvolved;
import com.chtw.bean.IndustryInvolvedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryInvolvedMapper {
    int countByExample(IndustryInvolvedExample example);

    int deleteByExample(IndustryInvolvedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustryInvolved record);

    int insertSelective(IndustryInvolved record);

    List<IndustryInvolved> selectByExample(IndustryInvolvedExample example);

    IndustryInvolved selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustryInvolved record, @Param("example") IndustryInvolvedExample example);

    int updateByExample(@Param("record") IndustryInvolved record, @Param("example") IndustryInvolvedExample example);

    int updateByPrimaryKeySelective(IndustryInvolved record);

    int updateByPrimaryKey(IndustryInvolved record);
}