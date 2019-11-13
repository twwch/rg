package com.chtw.controller;

import com.chtw.bean.PreferentialPolicy;
import com.chtw.service.PreferentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-19:38
 */
@Controller
@RequestMapping("/prefer")
public class PreferController {

    @Autowired
    private PreferentialService preferentialService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<PreferentialPolicy> getAll(){
        return preferentialService.getAll();
    }

}
