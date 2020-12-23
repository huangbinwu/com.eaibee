package com.eaibee.api.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @author
 * @date
 */
public class ServiceInterceptor implements MethodInterceptor {

    private Logger log= LoggerFactory.getLogger(ServiceInterceptor.class);

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        Object[] arguments = methodInvocation.getArguments();
        Class<? extends MethodInvocation> cls = methodInvocation.getClass();
        log.info("执行ServiceInterceptor拦截，{}.{}({})",cls.getName(),method.getName(),arguments);
        return methodInvocation.proceed();
    }
}
