package com.chtw.service;

import com.chtw.bean.InvestmentServices;
import com.chtw.bean.InvestmentServicesExample;
import com.chtw.mapper.InvestmentServicesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-15:22
 * 投资服务
 */
@Service
public class InvestServices {

    @Autowired
    private InvestmentServicesMapper investmentServicesMapper;

    @Autowired
    private InvestCiService investCiService;

    public int getInvestmentNumber(){
        return investmentServicesMapper.countByExample(new InvestmentServicesExample());
    }

    public List<InvestmentServices> getAll() {
        List<InvestmentServices> IList = investmentServicesMapper.selectByExample(new InvestmentServicesExample());
        for (InvestmentServices investmentServices : IList) {
            investmentServices.setCiList(investCiService.getCiList(investmentServices.getConId()));
        }
        return IList;
    }
}
