package com.chtw.service;

import com.alibaba.fastjson.JSONArray;
import com.chtw.bean.AttractInvestmentTable;
import com.chtw.bean.AttractInvestmentTableExample;
import com.chtw.mapper.AttractInvestmentTableMapper;
import com.chtw.utils.POIUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
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
    private Logger logger = LoggerFactory.getLogger(AttractService.class);
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

    public Integer addorsave(AttractInvestmentTable attractInvestmentTable) {
        int i = 0;
        if(attractInvestmentTable==null){
            return i;
        }else{
            if(attractInvestmentTable.getId()==null){
                i = tableMapper.insert(attractInvestmentTable);
                logger.info("添加招商引资信息");
            }else{
                i = tableMapper.updateByPrimaryKey(attractInvestmentTable);
                logger.info("修改招商引资信息");
            }
        }
        return i;
    }

    public PageInfo<AttractInvestmentTable> getPageAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<AttractInvestmentTable> aList = tableMapper.selectByExample(new AttractInvestmentTableExample());
        PageInfo<AttractInvestmentTable> apageInfo = new PageInfo<AttractInvestmentTable>(aList);
        return apageInfo;
    }

    public int dele(int id) {
        int i = tableMapper.deleteByPrimaryKey(id);
        return i;
    }

    public AttractInvestmentTable getById(int id) {
        return tableMapper.selectByPrimaryKey(id);
    }

    public void download(HttpServletResponse response){
        JSONArray head = new JSONArray();
        head.add("资源行业");
        head.add("涉及行业");
        head.add("项目名称");
        head.add("项目类型");
        head.add("涉及政策条款");
        head.add("面向对象");
        head.add("关键词");
        head.add("时间范围");
        head.add("资源提供主体");
        head.add("信息来源");
        head.add("备注");
        //查询失败的数据
        List<AttractInvestmentTable> fLists = getAll();

        //String data = JSON.toJSONString(fLists);
        JSONArray body = new JSONArray();//JSON.parseArray(data);
        JSONArray row = null;
        OutputStream os = null;
        for (AttractInvestmentTable h : fLists) {
            row = new JSONArray();
            row.add(h.getResourceIndustry());
            row.add(h.getIndustryInvolved());
            row.add(h.getEntryName());
            row.add(h.getEntryType());
            row.add(h.getPolicyProvisions());
            row.add(h.getObjectOriented());
            row.add(h.getKeywords());
            row.add(h.getTimeFrame());
            row.add(h.getResourceProvider());
            row.add(h.getInfoSources());
            row.add(h.getBz());
            body.add(row);
        }
        HSSFWorkbook wbook = POIUtils.expExcel("招商引资项目",head,body);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setLocale(new java.util.Locale("zh","CN"));
        response.setContentType("application/octet-stream");
        String fileName = null;
        try {
            fileName = URLEncoder.encode("招商引资项目.xls","UTF-8");
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
}
