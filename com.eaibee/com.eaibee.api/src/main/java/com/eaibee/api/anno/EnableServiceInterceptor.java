package com.eaibee.api.anno;

import com.eaibee.api.ServiceInterceptorConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(ServiceInterceptorConfiguration.class)
public @interface EnableServiceInterceptor {
}
