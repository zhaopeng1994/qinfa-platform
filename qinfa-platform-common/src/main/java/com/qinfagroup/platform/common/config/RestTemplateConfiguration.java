package com.qinfagroup.platform.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * HTTP客户端请求组件、阻塞式IO、适合低并发应用场景
 * @author peng.zhao
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    public HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        // 从连接管理器请求连接时使用的超时时间
        clientHttpRequestFactory.setConnectionRequestTimeout(5000);
        // 底层 HttpClient 的连接超时
        clientHttpRequestFactory.setConnectTimeout(5000);
        // 套接字读取超时
        clientHttpRequestFactory.setReadTimeout(5000);
        return clientHttpRequestFactory;
    }

    @Bean
    public RestTemplate restTemplate(HttpComponentsClientHttpRequestFactory clientHttpRequestFactory) {
        return new RestTemplate(clientHttpRequestFactory);
    }

}
