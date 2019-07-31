package com.eaibee.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudZookeeperClientAppApplication {

	/**
	 * zookeeper 为注册中心启动
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZookeeperClientAppApplication.class, args);
	}

}
