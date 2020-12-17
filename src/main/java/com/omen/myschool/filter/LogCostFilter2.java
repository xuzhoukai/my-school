package com.omen.myschool.filter;

import javax.servlet.*;
import java.io.IOException;

public class LogCostFilter2 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //servlet容器存在时
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Execute2 cost="+(System.currentTimeMillis()-start));
    }

   //servlet容器销毁时
    @Override
    public void destroy() {

    }
}
