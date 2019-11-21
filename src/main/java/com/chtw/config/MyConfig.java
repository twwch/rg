
package com.chtw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 设置默认页面
 * @author CHTW
 * @date 2019-10-15-9:12
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    //将组件添加在容器中
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer adapter = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("/user/login");
                registry.addViewController("/index.html").setViewName("user/index");
                registry.addViewController("/admin").setViewName("/admin/login");
                registry.addViewController("/admin/index.html").setViewName("admin/index");
                registry.addViewController("/admin/home.html").setViewName("admin/home");
                registry.addViewController("/goyuansouList").setViewName("admin/yuansou_list");
                registry.addViewController("/out").setViewName("admin/login");
                //registry.addViewController("/Attract/getAll").setViewName("home");
            }
        };
        return adapter;
    }
}