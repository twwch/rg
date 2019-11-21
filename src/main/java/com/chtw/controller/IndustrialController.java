package com.chtw.controller;

import com.chtw.bean.IndustrialType;
import com.chtw.service.IndustrialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-16:04
 */
@Controller
@RequestMapping("/Industrial")
public class IndustrialController {

    @Autowired
    private IndustrialService industrialService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<IndustrialType> getAll(){
        return industrialService.getAll();
    }
}
