package com.chtw.controller;

import com.chtw.utils.CodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 验证码
 * @author CHTW
 * @date 2019-11-18-8:24
 */
@Controller
public class CodeController {

    //@ResponseBody
    @RequestMapping("/getCode")
    public void getCode(HttpSession session, HttpServletResponse response){
        CodeUtil codeUtil = new CodeUtil();
        String code = codeUtil.getCode();
        session.setAttribute("code", code);
        //生成验证码图片
        BufferedImage image = codeUtil.getImage(code);
        OutputStream os = null;
        try {
            os = response.getOutputStream();
            ImageIO.write(image, "jpeg", os);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return null;
        // 将图片写入响应流
    }
}
