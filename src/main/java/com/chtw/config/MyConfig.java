
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
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("index");
                registry.addViewController("/home.html").setViewName("home");
                //registry.addViewController("/Attract/getAll").setViewName("home");
            }
        };
        return adapter;
    }
}