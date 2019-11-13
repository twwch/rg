package com.chtw.mapper;

import com.chtw.bean.DesignIndustry;
import com.chtw.bean.DesignIndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignIndustryMapper {
    int countByExample(DesignIndustryExample example);

    int deleteByExample(DesignIndustryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DesignIndustry record);

    int insertSelective(DesignIndustry record);

    List<DesignIndustry> selectByExample(DesignIndustryExample example);

    DesignIndustry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DesignIndustry record, @Param("example") DesignIndustryExample example);

    int updateByExample(@Param("record") DesignIndustry record, @Param("example") DesignIndustryExample example);

    int updateByPrimaryKeySelective(DesignIndustry record);

    int updateByPrimaryKey(DesignIndustry record);
}