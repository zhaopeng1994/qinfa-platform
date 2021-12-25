package com.qinfagroup.platform.gateway.config;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * 跨域配置类
 * @author peng.zhao
 */
public class WebCorsConfiguration {

    public CorsWebFilter corsWebFilter() {
        final CorsConfiguration configuration = new CorsConfiguration();
        // 允许cookie跨域
        configuration.setAllowCredentials(true);
        configuration.addAllowedOrigin("*");
        configuration.addAllowedHeader("*");
        // 设置遇见请求的缓存时间（s）
        configuration.setMaxAge(18000L);
        configuration.addAllowedMethod("*");

        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return new CorsWebFilter(source);
    }

}
