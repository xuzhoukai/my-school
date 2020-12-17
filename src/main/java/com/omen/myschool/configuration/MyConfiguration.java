package com.omen.myschool.configuration;

import com.omen.myschool.filter.LogCostFilter;
import com.omen.myschool.filter.LogCostFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public FilterRegistrationBean registration(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogCostFilter());//实例化Filter类
        filterRegistrationBean.addUrlPatterns("/*");//设置匹配模式,这里设置为所有，可以按需求设置为"/hello"等等
        filterRegistrationBean.setName("LogCostFilter");//设置过滤器名称
        filterRegistrationBean.setOrder(1);//设置执行顺序
        return filterRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean registration2(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogCostFilter2());//实例化Filter类
        filterRegistrationBean.addUrlPatterns("/*");//设置匹配模式,这里设置为所有，可以按需求设置为"/hello"等等
        filterRegistrationBean.setName("LogCostFilter2");//设置过滤器名称
        filterRegistrationBean.setOrder(2);//设置执行顺序
        return filterRegistrationBean;
    }
}
