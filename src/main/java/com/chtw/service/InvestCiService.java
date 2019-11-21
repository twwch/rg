package com.chtw.service;

import com.chtw.bean.InvestmentServicesCi;
import com.chtw.bean.InvestmentServicesCiExample;
import com.chtw.mapper.InvestmentServicesCiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-16:39
 */
@Service
public class InvestCiService {
    @Autowired
    private InvestmentServicesCiMapper investmentServicesCiMapper;

    @Autowired
    private IndustryInvolvedService indService;

    public List<InvestmentServicesCi> getCiList(Integer conId) {
        InvestmentServicesCiExample example = new InvestmentServicesCiExample();
        InvestmentServicesCiExample.Criteria re = example.createCriteria();
        re.andConIdEqualTo(conId);
        List<InvestmentServicesCi> ICIList = investmentServicesCiMapper.selectByExample(example);
        for (InvestmentServicesCi investmentServicesCi : ICIList) {
            investmentServicesCi.setInduList(indService.getinduList(investmentServicesCi.getIndustryInvolvedId()));
        }
        return ICIList;
    }
}
