package com.chtw.service;

import com.chtw.bean.IndustryInvolved;
import com.chtw.bean.IndustryInvolvedExample;
import com.chtw.mapper.IndustryInvolvedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-16:45
 */
@Service
public class IndustryInvolvedService {
    @Autowired
    private IndustryInvolvedMapper industryInvolvedMapper;

    public List<IndustryInvolved> getinduList(int id){
        IndustryInvolvedExample example = new IndustryInvolvedExample();
        IndustryInvolvedExample.Criteria re = example.createCriteria();
        re.andIndustryInvolvedIdEqualTo(id);
        return industryInvolvedMapper.selectByExample(example);
    }
}
