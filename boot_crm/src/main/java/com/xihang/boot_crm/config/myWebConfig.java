package com.xihang.boot_crm.config;

import com.xihang.boot_crm.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program:boot_crm
 * @description:web配置
 * @author:hehuhu
 * @create:2020-08-24 20:16
 **/
@Configuration
public class myWebConfig implements WebMvcConfigurer {
    // 配置默认启动页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        WebMvcConfigurer.super.addViewControllers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/index.html","/UserLogin");
    }
}
