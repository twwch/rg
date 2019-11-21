package com.chtw.service;

import com.chtw.bean.IndustrialCon;
import com.chtw.bean.IndustrialConExample;
import com.chtw.mapper.IndustrialConMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-16:13
 */
@Service
public class IndustrialConService {

    @Autowired
    private IndustrialConMapper conMapper;

    public List<IndustrialCon> getConList(int id){
        IndustrialConExample example = new IndustrialConExample();
        IndustrialConExample.Criteria re = example.createCriteria();
        re.andConIdEqualTo(id);
        return conMapper.selectByExample(example);
    }
}
