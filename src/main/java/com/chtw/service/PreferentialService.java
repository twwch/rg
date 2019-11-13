package com.chtw.service;

import com.chtw.bean.PreferentialPolicy;
import com.chtw.bean.PreferentialPolicyExample;
import com.chtw.mapper.PreferentialPolicyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-15:24
 * 政策优惠
 */
@Service
public class PreferentialService {

    @Autowired
    private PreferentialPolicyMapper policyMapper;

    @Autowired
    private PreferentialPolicyCiService preferentialPolicyCiService;

    public int getPreferentialNumber(){
        return policyMapper.countByExample(new PreferentialPolicyExample());
    }

    public List<PreferentialPolicy> getAll() {
        List<PreferentialPolicy> preList = policyMapper.selectByExample(new PreferentialPolicyExample());
        for (PreferentialPolicy p : preList) {
            p.setPreCiList(preferentialPolicyCiService.getPreCiList(p.getResourceTypeId()));
        }
        return preList;
    }
}
