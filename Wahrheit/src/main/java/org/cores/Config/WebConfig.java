package org.cores.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 设置跨域访问的路径
                .allowedOrigins("*") // 设置允许跨域访问的域名
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 设置允许的请求方法
                .allowedHeaders("*") // 设置允许的请求头
                .allowCredentials(true); // 设置是否允许证书
    }
}