package com.chtw.service;

import com.chtw.bean.AttractInvestmentTable;
import com.chtw.bean.User;
import com.chtw.bean.UserExample;
import com.chtw.mapper.UserMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author CHTW
 * @date 2019-11-09-19:44
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    AttractService attractService;

    @Autowired
    IndustrialService industrialService;

    @Autowired
    InvestServices investServices;

    @Autowired
    PreferentialService preferentialService;

    public List<User> getAll(){
        return userMapper.selectByExample(new UserExample());
    }

    public Map<String,Integer> getNumberInfo() {
        Map<String,Integer> map = new HashMap<>();
        map.put("AttractNumber",attractService.getAllNumber());
        map.put("IndustrialTypeNumber",industrialService.getIndustrialTypeNumber());
        map.put("investServicesNumber",investServices.getInvestmentNumber());
        map.put("preferentialNumber",preferentialService.getPreferentialNumber());
        return map;
    }
}
