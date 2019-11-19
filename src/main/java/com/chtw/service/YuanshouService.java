package com.chtw.service;

import com.alibaba.fastjson.JSONArray;
import com.chtw.bean.Yuansou;
import com.chtw.bean.YuansouExample;
import com.chtw.mapper.YuansouMapper;
import com.chtw.utils.POIUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-16-15:43
 */
@Service
public class YuanshouService {

    @Autowired
    private YuansouMapper yuansouMapper;

    public List<Yuansou> getAll(){
        return yuansouMapper.selectByExample(new YuansouExample());
    }

    public Integer getYuansouNumber() {
        return yuansouMapper.countByExample(new YuansouExample());
    }

    public int addorsave(Yuansou yuansou) {
        System.out.println("yuansou id="+yuansou.getId());
        int i = 0;
        if (yuansou==null){
            return  i;
        }else{
            if(yuansou.getId()==null){
                i = yuansouMapper.insert(yuansou);
            }else{
                i = yuansouMapper.updateByPrimaryKey(yuansou);
            }
            return i;
        }
    }

    public void download(HttpServletResponse response) {
        JSONArray head = new JSONArray();
        head.add("时间");
        head.add("地点");
        head.add("国家");
        head.add("他国领导人职务/姓名");
        head.add("签署文件/联合声明");
        head.add("议题数量");
        head.add("议题情况");
        head.add("我国-议题及事项");
        head.add("我国-领域");
        head.add("我国-细分领域");
        head.add("我国-合作");
        head.add("他国-议题及事项");
        head.add("他国-领域");
        head.add("他国-细分领域");
        head.add("他国-合作");
        head.add("备注");
        head.add("信息来源");


        List<Yuansou> fLists = getAll();
        JSONArray body = new JSONArray();//JSON.parseArray(data);
        JSONArray row = null;
        OutputStream os = null;
        for (Yuansou fList : fLists) {
            row = new JSONArray();
            row.add(fList.getTime());
            row.add(fList.getAddress());
            row.add(fList.getCountry());
            row.add(fList.getLeader());
            row.add(fList.getFile());
            row.add(fList.getNumberOfIssues());
            row.add(fList.getIssueSituation());
            row.add(fList.getIssuesIssuesOur());
            row.add(fList.getFieldOfOur());
            row.add(fList.getXiFieldOfOur());
            row.add(fList.getOurCooperation());
            row.add(fList.getIssuesIssuesTg());
            row.add(fList.getFieldOfTg());
            row.add(fList.getXiFieldOfTg());
            row.add(fList.getTgCooperation());
            row.add(fList.getBz());
            row.add(fList.getInfo());
            body.add(row);
        }
        HSSFWorkbook wbook = POIUtils.expExcel("国家元首议程",head,body);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setLocale(new java.util.Locale("zh","CN"));
        response.setContentType("application/octet-stream");
        String fileName = null;
        try {
            fileName = URLEncoder.encode("国家元首议程.xls","UTF-8");
            response.addHeader("Content-Disposition","attachment;fileName="+fileName);
            os = response.getOutputStream();
            wbook.write(os);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getAllNumber() {
        return yuansouMapper.countByExample(new YuansouExample())+"";
    }


    public PageInfo<Yuansou> getPageAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<Yuansou> aList = yuansouMapper.selectByExample(new YuansouExample());
        PageInfo<Yuansou> apageInfo = new PageInfo<Yuansou>(aList);
        return apageInfo;
    }

    public void dele(int id) {
        yuansouMapper.deleteByPrimaryKey(id);
        System.out.println("删除"+id+"号信息成功");
    }

    public Yuansou getById(int id) {
        return yuansouMapper.selectByPrimaryKey(id);
    }
}
