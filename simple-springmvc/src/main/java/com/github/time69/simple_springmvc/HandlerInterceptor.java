package com.github.time69.simple_springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 描述: 拦截器
 *
 * @author <a href="1348555156@qq.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/8/23
 */
public interface HandlerInterceptor {
    /**
     * @param httpServletRequest
     * @param response
     * @return true:继续执行拦截器链; false:终止执行拦截器链
     */
    boolean preHandler(HttpServletRequest httpServletRequest, HttpServletResponse response) throws Exception;

    boolean postHandler(HttpServletRequest httpServletRequest, HttpServletResponse response, ModelAndView modelAndView) throws Exception;
}