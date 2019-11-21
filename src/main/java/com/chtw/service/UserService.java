package com.chtw.service;

import com.chtw.bean.User;
import com.chtw.bean.UserExample;
import com.chtw.mapper.UserMapper;
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

    @Autowired
    private YuanshouService yuanshouService;

    public List<User> getAll(){
        return userMapper.selectByExample(new UserExample());
    }

    public Map<String,Integer> getNumberInfo() {
        Map<String,Integer> map = new HashMap<>();
        map.put("AttractNumber",attractService.getAllNumber());
        map.put("IndustrialTypeNumber",industrialService.getIndustrialTypeNumber());
        map.put("investServicesNumber",investServices.getInvestmentNumber());
        map.put("preferentialNumber",preferentialService.getPreferentialNumber());
        map.put("yuansouNumber",yuanshouService.getYuansouNumber());
        return map;
    }

    public int login(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria re = example.createCriteria();
        re.andAccountEqualTo(user.getAccount());
        re.andPasswordEqualTo(user.getPassword());
        return userMapper.selectByExample(example).size();
    }

    public int checkUser(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria re = example.createCriteria();
        re.andAccountEqualTo(user.getAccount());
        return userMapper.selectByExample(example).size();
    }

    public int register(User user) {
        if(!user.getIdNumber().equals("")){
            String sex = user.getIdNumber().substring(16,17);
            if(Integer.parseInt(sex) % 2 == 0){
                user.setGender("女");
            }else{
                user.setGender("男");
            }
            if(user.getLevel()==null){
                user.setLevel("1");
            }
            System.out.println(user.toString());
            return userMapper.insert(user);
        }
        return 0;
    }
}
