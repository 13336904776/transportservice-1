package com.xinbitiangao.transportservice.aop;

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
public class WebAspect {
    @Pointcut("execution(public * com.xinbitiangao.transportservice.controller.*.*(..))")
    public void webLog() {}

    @Before("webLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("**************服 务 器 处 理 请 求**************");
        System.out.println("作者 : 黄大胖子             GitHub : GarfieldHuang");
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        System.out.println("URL : " + request.getRequestURL().toString());
        System.out.println("IP  : " + request.getRemoteAddr());
        //  请求参数
        System.out.println("--------------请求数据--------------");
        System.out.println(JSONObject.fromObject(joinPoint.getArgs()[0]).toString());
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        System.out.println("--------------返回数据--------------");
        System.out.println(JSONObject.fromObject(ret));
        System.out.println();
        System.out.println();
    }

    //后置异常通知
    @AfterThrowing("webLog()")
    public void throwss(JoinPoint jp) {
        System.out.println();
        System.out.println();
        System.out.println("******************异常*******************");
        System.out.println();
        System.out.println();
    }

}
