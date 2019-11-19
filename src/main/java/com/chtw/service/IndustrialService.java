package com.chtw.service;


import com.chtw.bean.IndustrialType;
import com.chtw.bean.IndustrialTypeExample;
import com.chtw.mapper.IndustrialTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-15:18
 * 产业类型
 */
@Service
public class IndustrialService {

    @Autowired
    private IndustrialTypeMapper typeMapper;

    @Autowired
    private IndustrialConService conService;

    public int getIndustrialTypeNumber(){
        return typeMapper.countByExample(new IndustrialTypeExample());
    }

    public List<IndustrialType> getAll() {
        List<IndustrialType> IList = typeMapper.selectByExample(new IndustrialTypeExample());
        for (IndustrialType industrialType : IList) {
            industrialType.setConList(conService.getConList(industrialType.getConId()));
        }
        return IList;
    }
}
