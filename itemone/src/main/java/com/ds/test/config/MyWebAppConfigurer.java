package com.ds.test.config;

import com.ds.test.interceptor.BaseInterceptor;
import com.ds.test.until.SpringContextUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Map;

@Configuration
@PropertySource({
        "classpath:application.yml"
})
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链 addPathPatterns 用于添加拦截规则 excludePathPatterns 用户排除拦截
        Map<String, BaseInterceptor> interceptorMap = SpringContextUtil.getContext().getBeansOfType(BaseInterceptor.class);
        for (String key : interceptorMap.keySet()) {
            registry.addInterceptor(interceptorMap.get(key)).addPathPatterns("/**");
        }
        super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

}