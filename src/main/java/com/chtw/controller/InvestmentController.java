package com.chtw.controller;

import com.chtw.bean.InvestmentServices;
import com.chtw.service.InvestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-16:34
 */
@Controller
@RequestMapping("/Investment")
public class InvestmentController {

    @Autowired
    private InvestServices investServices;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<InvestmentServices> getAll(){
        return investServices.getAll();
    }
}
