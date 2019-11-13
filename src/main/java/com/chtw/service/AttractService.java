package com.chtw.service;

import com.chtw.bean.AttractInvestmentTable;
import com.chtw.bean.AttractInvestmentTableExample;
import com.chtw.mapper.AttractInvestmentTableMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-15:05
 * 招商引资项目
 */
@Service
public class AttractService {

    @Autowired
    private AttractInvestmentTableMapper tableMapper;

    /**
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    public PageInfo<AttractInvestmentTable> getAttractInvestmentTableInfo(int page, int size){
        PageHelper.startPage(page, size);
        List<AttractInvestmentTable> AList = tableMapper.selectByExample(new AttractInvestmentTableExample());
        PageInfo<AttractInvestmentTable> Ainfo =  new PageInfo<AttractInvestmentTable>(AList);
        return Ainfo;
    }

    public Integer getAllNumber() {
        return tableMapper.countByExample(new AttractInvestmentTableExample());
    }

    public List<AttractInvestmentTable> getAll() {
        return tableMapper.selectByExample(new AttractInvestmentTableExample());
    }

    public Integer add(AttractInvestmentTable attractInvestmentTable) {
        return tableMapper.insert(attractInvestmentTable);
    }
}
