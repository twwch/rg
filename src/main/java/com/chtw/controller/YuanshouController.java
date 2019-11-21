package com.chtw.controller;

import com.chtw.bean.Yuansou;
import com.chtw.service.YuanshouService;
import com.chtw.utils.UplodaUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-16-15:42
 */
@Controller
@RequestMapping("/Yuanshou")
public class YuanshouController {

    @Value("${lcbs.filepath}")
    private String uploadPath;

    @Autowired
    private YuanshouService yuanshouService;
    private Logger logger = LoggerFactory.getLogger(YuanshouController.class);
    @RequestMapping("/getAll")
    @ResponseBody
    public List<Yuansou> getAll(){
        return yuanshouService.getAll();
    }

    @ResponseBody
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request){
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
            List excelList = UplodaUtil.readExcelYuanshou(file1,filename);
            for (int i = 0; i < excelList.size(); i++) {
                List list = (List) excelList.get(i);
                for (int j = 0; j < list.size(); j++) {
                    Yuansou yuansou = (Yuansou)list.get(j);
                    //System.out.println(attract.toString());
                    yuanshouService.addorsave(yuansou);
                }
            }
            if (file1.isFile()) {
                logger.info("删除单个文件" + file1.getAbsolutePath() + "成功！");
                file1.delete();
            }
            multipartRequest = null;
            multipartFile = null;
            return "200";
        }else{
            return "500";
        }
    }

    @RequestMapping("/download")
    public void download(HttpServletResponse response){
        yuanshouService.download(response);
    }

    @RequestMapping("/getAllNumber")
    @ResponseBody
    public String getAllNumber(){
        return yuanshouService.getAllNumber();
    }

    @ResponseBody
    @RequestMapping("/databases")
    public List<Yuansou> databases(int page){
        return yuanshouService.getPageAll(page,12).getList();
    }

    @RequestMapping("/dele")
    @ResponseBody
    public String dele(int id){

        yuanshouService.dele(id);
        return null;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public Yuansou getById(int id){
        return yuanshouService.getById(id);
    }

    @RequestMapping("/save")
    @ResponseBody
    public String  save(Yuansou yuansou){
        if(yuansou==null){
            return null;
        }else{
            int i = yuanshouService.addorsave(yuansou);
            return i+"";
        }
    }
}
