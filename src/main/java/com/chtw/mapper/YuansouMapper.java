package com.chtw.mapper;

import com.chtw.bean.Yuansou;
import com.chtw.bean.YuansouExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YuansouMapper {
    int countByExample(YuansouExample example);

    int deleteByExample(YuansouExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Yuansou record);

    int insertSelective(Yuansou record);

    List<Yuansou> selectByExample(YuansouExample example);

    Yuansou selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Yuansou record, @Param("example") YuansouExample example);

    int updateByExample(@Param("record") Yuansou record, @Param("example") YuansouExample example);

    int updateByPrimaryKeySelective(Yuansou record);

    int updateByPrimaryKey(Yuansou record);
}