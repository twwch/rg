package com.chtw.mapper;

import com.chtw.bean.TextObject;
import com.chtw.bean.TextObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextObjectMapper {
    int countByExample(TextObjectExample example);

    int deleteByExample(TextObjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TextObject record);

    int insertSelective(TextObject record);

    List<TextObject> selectByExample(TextObjectExample example);

    TextObject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TextObject record, @Param("example") TextObjectExample example);

    int updateByExample(@Param("record") TextObject record, @Param("example") TextObjectExample example);

    int updateByPrimaryKeySelective(TextObject record);

    int updateByPrimaryKey(TextObject record);
}