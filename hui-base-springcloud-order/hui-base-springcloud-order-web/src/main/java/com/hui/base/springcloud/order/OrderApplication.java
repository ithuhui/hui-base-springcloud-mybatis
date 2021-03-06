package com.hui.base.springcloud.order;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b><code>OrderApplication</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/2/25 16:53.
 *
 * @author Hu-Weihui
 * @since hui-base-springcloud ${PROJECT_VERSION}
 */
@SpringBootApplication(scanBasePackages = "com.hui.base.springcloud")
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan("com.hui.base.springcloud.*.mapper")
@EnableHystrixDashboard
@EnableFeignClients("com.hui.base.springcloud")
@EnableDistributedTransaction
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
