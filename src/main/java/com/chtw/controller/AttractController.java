package com.chtw.controller;

import com.chtw.bean.AttractInvestmentTable;
import com.chtw.service.AttractService;
import com.chtw.service.UserService;
import com.chtw.utils.UplodaUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
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

    @Value("${lcbs.filepath}")
    private String uploadPath;

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
        int i = attractService.addorsave(attractInvestmentTable);
        if(i>0){
            logger.info("招商引资项目"+attractInvestmentTable.toString());
            return list;
        }else {
            return null;
        }
    }

    @RequestMapping("/Attract_list.html")
    public String goAttract_list(Model model){
        Map<String,Integer> map = userService.getNumberInfo();
        model.addAttribute("AttractNumber",map.get("AttractNumber"));
        return "admin/Attract_list";
    }

    @RequestMapping("/getAllNumber")
    @ResponseBody
    public String getAllNumber(){
        return attractService.getAllNumber().toString();
    }


    @RequestMapping("/getpages")
    @ResponseBody
    public String getpages() {
        int pages = attractService.getPageAll(1, 12).getPages();
        return pages + "";
    }

    @RequestMapping("/databases")
    @ResponseBody
    public List<AttractInvestmentTable> geDatabases(int page){
        return attractService.getPageAll(page, 12).getList();
    }

    @ResponseBody
    @RequestMapping("/dele")
    public String dele(int id){
        logger.info("删除第"+id+"条成功");
        int i = attractService.dele(id);
        return null;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public AttractInvestmentTable getById(int id){
        return attractService.getById(id);
    }

    @ResponseBody
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request,HttpSession session) {
        MultipartHttpServletRequest multipartRequest=(MultipartHttpServletRequest) request;
        MultipartFile multipartFile = multipartRequest.getFile("file");//file是form-data中二进制字段对应的name
        // 本地保存路径
        String filename = null;
        File file = new File(uploadPath);
        // 存储路径不存在则创建文件夹
        if (!file.exists()) {
            file.mkdirs();
        }
        filename = multipartFile.getOriginalFilename();
        if (filename.endsWith("xls")||filename.endsWith("xlsx")) {
            logger.info("filename=" + filename);
            File target = new File(uploadPath + file.separator + multipartFile.getOriginalFilename());
            try {
                multipartFile.transferTo(target);
            } catch (IllegalStateException | IOException e) {
                e.printStackTrace();
            }
            File file1 = new File(uploadPath + file.separator + filename);
            List excelList = UplodaUtil.readExcelAttract(file1,filename);
            for (int i = 0; i < excelList.size(); i++) {
                List list = (List) excelList.get(i);
                for (int j = 0; j < list.size(); j++) {
                    AttractInvestmentTable attract = (AttractInvestmentTable)list.get(j);
                    //System.out.println(attract.toString());
                    attractService.addorsave(attract);
                }
            }
            if (file1.isFile()) {
                logger.info("删除单个文件" + file1.getAbsolutePath() + "成功！");
                file1.delete();
            }
            Map<String,Integer> map = userService.getNumberInfo();
            session.setAttribute("AttractNumber",map.get("AttractNumber"));
            multipartRequest = null;
            multipartFile = null;
            return "200";
        } else {
            return "500";
        }
    }

    @RequestMapping("/download")
    public void download(HttpServletResponse response){
        attractService.download(response);
    }
}
