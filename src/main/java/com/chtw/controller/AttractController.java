package com.chtw.controller;

import com.chtw.bean.AttractInvestmentTable;
import com.chtw.service.AttractService;
import com.chtw.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author CHTW
 * @date 2019-11-10-15:04
 * 招商引资
 */
@Controller
@RequestMapping("/Attract")
public class AttractController {

    @Autowired
    private AttractService attractService;

    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(AttractController.class);

    @RequestMapping("/getAll")
    @ResponseBody
    public List<AttractInvestmentTable> getAll(){
        return attractService.getAll();
    }

    @RequestMapping("/save")
    @ResponseBody
    public List<AttractInvestmentTable> save(AttractInvestmentTable attractInvestmentTable){
        List<AttractInvestmentTable> list = new ArrayList<>();
        list.add(attractInvestmentTable);
        int i = attractService.add(attractInvestmentTable);
        if(i>0){
            logger.info("招商引资项目"+attractInvestmentTable.toString());
            return list;
        }else {
            return null;
        }
    }

    @RequestMapping("/Attract_list.html")
    public String goAttract_list(Model model){
        model.addAttribute("msg","hello");
        Map<String,Integer> map = userService.getNumberInfo();
        model.addAttribute("AttractNumber",map.get("AttractNumber"));

        return "user_list";
    }
}
