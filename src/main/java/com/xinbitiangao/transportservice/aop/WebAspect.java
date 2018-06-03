package com.xinbitiangao.transportservice.aop;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 整个项目接口接受参数与返回参数的日志切面
 */
@Aspect
@Component
@Slf4j
public class WebAspect {
    @Pointcut("execution(public * com.xinbitiangao.transportservice.controller.*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public synchronized void deBefore(JoinPoint joinPoint) throws Throwable {
        log.info("**************服 务 器 处 理 请 求**************");
        log.info("作者 : 黄大胖子");
        log.info("GitHub : GarfieldHuang");
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("IP  : " + request.getRemoteAddr());
        //  请求参数
        log.info("--------------请求数据--------------");
        log.info(joinPoint.getArgs()[0].toString());
    }

    //后置异常通知
    @AfterThrowing("webLog()")
    public synchronized void throwss(JoinPoint jp) {
        log.info("******************异常*******************");
    }

}
