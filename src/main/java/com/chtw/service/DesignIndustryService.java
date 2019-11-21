package com.chtw.service;

import com.chtw.bean.DesignIndustry;
import com.chtw.bean.DesignIndustryExample;
import com.chtw.mapper.DesignIndustryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-19:58
 */
@Service
public class DesignIndustryService {
    @Autowired
    private DesignIndustryMapper designIndustryMapper;

    public List<DesignIndustry> getDList(int id){
        DesignIndustryExample example = new DesignIndustryExample();
        DesignIndustryExample.Criteria re = example.createCriteria();
        re.andDesignIndustryIdEqualTo(id);
        return designIndustryMapper.selectByExample(example);

    }
}
