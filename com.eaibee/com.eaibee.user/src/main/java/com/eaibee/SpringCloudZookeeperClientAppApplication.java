package com.eaibee;

import com.eaibee.api.anno.EnableServiceInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author
 * @date
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableServiceInterceptor
@PropertySource("classpath:/application.yml")
public class SpringCloudZookeeperClientAppApplication extends SpringBootServletInitializer {

	/**
	 * zookeeper 为注册中心启动
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			SpringApplication.run(SpringCloudZookeeperClientAppApplication.class, args);
		}catch (Throwable e){
			e.printStackTrace();
		}

	}

}
