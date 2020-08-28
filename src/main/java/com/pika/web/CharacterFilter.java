//package com.pika.web;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//
///**
// *   handling Garbled code， process all the requests 解决乱码问题
// */
//@WebFilter("/*")
//public class CharacterFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse rep, FilterChain filterChain) throws ServletException, IOException {
//
//
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) rep;
//        // get request
//        String method = request.getMethod();
//        // for solving chinese characters in post
//        if(method.equalsIgnoreCase("post")){
//            request.setCharacterEncoding("utf-8");
//        }
//        //  handling Garbled code
//        response.setContentType("text/html;charset=utf-8");
//        filterChain.doFilter(request,response);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}