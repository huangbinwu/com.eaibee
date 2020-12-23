package com.eaibee.api;

import com.eaibee.api.interceptor.ServiceInterceptor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hbw
 * @date
 */
@Configuration
public class ServiceInterceptorConfiguration {

    @Bean
    public ServiceInterceptor serviceInterceptor() {
        ServiceInterceptor serviceInterceptor = new ServiceInterceptor();
        return serviceInterceptor;
    }

    @Bean
    public DefaultPointcutAdvisor serviceAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* com.eaibee.api.services..*.*(..))");
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(serviceInterceptor());
        return advisor;
    }

}
