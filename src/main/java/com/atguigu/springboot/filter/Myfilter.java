package com.atguigu.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

public class Myfilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("myfilter process...");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
