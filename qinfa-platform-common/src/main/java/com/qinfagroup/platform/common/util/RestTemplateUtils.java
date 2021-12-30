package com.qinfagroup.platform.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

/**
 * RestTemplate 组件工具类
 * @author peng.zhao
 */
@Component
public class RestTemplateUtils {

    private static RestTemplate RT;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        RestTemplateUtils.RT = restTemplate;
    }

    /**
     * GET 请求
     * @param url GET请求地址
     * @param responseType 返回对象类型
     */
    public static <T> ResponseEntity<T> get(String url, Class<T> responseType) throws RestClientException {
        return RT.getForEntity(url, responseType);
    }

    /**
     * GET 请求
     * @param url 请求地址（带参数占位符）
     * @param responseType 返回对象类型
     * @param uriVariables url参数值按顺序
     */
    public static <T> ResponseEntity<T> get(String url, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return RT.getForEntity(url, responseType, uriVariables);
    }

    /**
     * GET 请求
     * @param url GET请求地址
     * @param responseType 返回对象类型
     * @param uriVariables url 参数键值对
     */
    public static <T> ResponseEntity<T> get(String url, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(url);
        uriVariables.forEach(uriComponentsBuilder::queryParam);
        return RT.getForEntity(uriComponentsBuilder.build().encode().toString(), responseType);
    }

    /**
     * GET 请求
     * @param url 请求地址
     * @param httpHeaders 请求头
     * @param responseType 返回对象类型
     * @param params 请求参数Map类型封装
     */
    public static <T> ResponseEntity<T> get(String url, HttpHeaders httpHeaders, Class<T> responseType, Map<String, ?> params) throws RestClientException {
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(url);
        params.forEach(uriComponentsBuilder::queryParam);
        return RT.exchange(uriComponentsBuilder.build().encode().toString(), HttpMethod.GET, new HttpEntity<>(httpHeaders), responseType);
    }

    /**
     * GET 请求
     * @param url 请求地址
     * @param headers Map类型请求头
     * @param responseType 返回对象类型
     * @param params 请求参数Map类型封装
     */
    public static <T> ResponseEntity<T> get(String url, Map<String, String> headers, Class<T> responseType, Map<String, ?> params) throws RestClientException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAll(headers);
        return get(url, httpHeaders, responseType, params);
    }

    /**
     * POST 请求
     * @param url 请求地址
     * @param responseType 响应对象类型
     */
    public static <T> ResponseEntity<T> post(String url, Class<T> responseType) throws RestClientException {
        return RT.postForEntity(url, HttpEntity.EMPTY, responseType);
    }

    /**
     * POST 请求
     * @param url 请求地址
     * @param requestBody 请求体
     * @param responseType 响应体对象类型
     */
    public static <T> ResponseEntity<T> post(String url, Object requestBody, Class<T> responseType) throws RestClientException {
        return RT.postForEntity(url, requestBody, responseType);
    }

    /**
     * POST 请求
     * @param url 请求地址（带参数占位符）
     * @param requestBody 请求体
     * @param responseType 响应体对象类型
     * @param uriVariables url请求参数值（按顺序）
     */
    public static <T> ResponseEntity<T> post(String url, Object requestBody, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return RT.postForEntity(url, requestBody, responseType, uriVariables);
    }

    /**
     * POST 请求
     * @param url 请求地址
     * @param requestBody 请求体
     * @param responseType 响应体对象类型
     * @param uriVariables url参数键值对
     */
    public static <T> ResponseEntity<T> post(String url, Object requestBody, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(url);
        uriVariables.forEach(uriComponentsBuilder::queryParam);
        return RT.postForEntity(uriComponentsBuilder.build().encode().toString(), requestBody, responseType);
    }

    /**
     * POST 请求
     * @param url 请求地址
     * @param headers 请求头键值对
     * @param requestBody 请求体
     * @param responseType 响应体对象类型
     * @param uriVariables url参数键值对
     */
    public static <T> ResponseEntity<T> post(String url, Map<String, String> headers, Object requestBody, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAll(headers);
        return post(url, httpHeaders, requestBody, responseType, uriVariables);
    }

    /**
     * POST 请求
     * @param url 请求地址
     * @param requestHeader 请求头
     * @param requestBody 请求体
     * @param responseType 响应体对象类型
     * @param uriVariables url参数键值对
     */
    private static <T> ResponseEntity<T> post(String url, HttpHeaders requestHeader, Object requestBody, Class<T> responseType, Map<String,?> uriVariables) {
        HttpEntity<Object> requestEntity = new HttpEntity<>(requestBody, requestHeader);
        return post(url, requestEntity, responseType, uriVariables);
    }


    /**
     * 自定义请求头、请求体POST请求
     * @param url 请求地址（带参数占位符）
     * @param requestEntity 请求entity
     * @param responseType 响应体对象类型
     * @param uriVariables url请求参数值（按顺序）
     */
    public static <T> ResponseEntity<T> post(String url, HttpEntity<?> requestEntity, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return RT.exchange(url, HttpMethod.POST, requestEntity, responseType, uriVariables);
    }

    /**
     * 自定义请求头、请求体POST请求
     * @param url 请求地址
     * @param requestEntity 请求entity
     * @param responseType 响应体对象类型
     * @param uriVariables url参数键值对
     */
    public static <T> ResponseEntity<T> post(String url, HttpEntity<?> requestEntity, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(url);
        uriVariables.forEach(uriComponentsBuilder::queryParam);
        return RT.exchange(uriComponentsBuilder.build().encode().toString(), HttpMethod.POST, requestEntity, responseType);
    }


}
