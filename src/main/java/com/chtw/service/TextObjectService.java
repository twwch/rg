package com.chtw.service;

import com.chtw.bean.TextObject;
import com.chtw.bean.TextObjectExample;
import com.chtw.mapper.TextObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-10-19:51
 */
@Service
public class TextObjectService {

    @Autowired
    private TextObjectMapper textObjectMapper;

    @Autowired
    private DesignIndustryService designIndustryService;

    public List<TextObject> getOlist(int id){
        TextObjectExample example = new TextObjectExample();
        TextObjectExample.Criteria re = example.createCriteria();
        re.andConIdEqualTo(id);
        List<TextObject> OList = textObjectMapper.selectByExample(example);
        for (TextObject to : OList) {
            to.setdList(designIndustryService.getDList(to.getDesignIndustryId()));
        }
        return OList;
    }
}
