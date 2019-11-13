package com.chtw.service;

import com.chtw.bean.PreferentialPolicyCi;
import com.chtw.bean.PreferentialPolicyCiExample;
import com.chtw.mapper.PreferentialPolicyCiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-19:44
 */

@Service
public class PreferentialPolicyCiService {

    @Autowired
    private PreferentialPolicyCiMapper preferentialPolicyCiMapper;

    @Autowired
    private TextObjectService textObjectService;

    public List<PreferentialPolicyCi> getPreCiList(int id){
        PreferentialPolicyCiExample example = new PreferentialPolicyCiExample();
        PreferentialPolicyCiExample.Criteria re = example.createCriteria();
        re.andResourceTypeIdEqualTo(id);
        List<PreferentialPolicyCi> PreCiList = preferentialPolicyCiMapper.selectByExample(example);
        for (PreferentialPolicyCi p : PreCiList) {
            p.setOList(textObjectService.getOlist(p.getConId()));
        }
        return PreCiList;
    }
}
