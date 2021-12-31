package com.qinfagroup.platform.uaa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * OAuth2 配置类
 * @author peng.zhao
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2Configuration extends AuthorizationServerConfigurerAdapter {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    public UserDetailsService platformUserDetailsService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenStore redisTokenStore;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        /**
         * redis token 方式
         * authenticationManager(authenticationManager) 调用此方法才能支持password模式
         * userDetailsService(platformUserDetailsService) 设置用户验证服务
         * tokenStore(redisTokenStore) 指定 token 的存储方式
         */
        endpoints.authenticationManager(authenticationManager)
                .userDetailsService(platformUserDetailsService)
                .tokenStore(redisTokenStore);
    }

    /**
     * 1.authorizedGrantTypes 可以包括如下几种设置中的一种或多种：
     *  authorization_code：授权码类型
     *  implicit：隐式授权类型
     *  password：资源所有者（即用户）密码类型
     *  client_credentials：客户端凭据（客户端ID以及Key）类型
     *  refresh_token：通过以上授权获得的刷新令牌来获取新的令牌
     * 2.scopes：用来限制客户端访问的权限，在换取的 token 的时候会带上 scope 参数，
     *  只有在 scopes 定义内的，才可以正常换取 token
     * 3.accessTokenValiditySeconds：token 有效期
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("order-client")
                .secret(passwordEncoder.encode("order-secret-8888"))
                .authorizedGrantTypes("refresh_token", "authorization_code", "password")
                .accessTokenValiditySeconds(3600)
                .scopes("all")
                .and()
                .withClient("coal-mine-client")
                .secret(passwordEncoder.encode("coal-mine-secret-8888"))
                .authorizedGrantTypes("refresh_token", "authorization_code", "password")
                .accessTokenValiditySeconds(3600)
                .scopes("all");
    }

    /**
     * 限制客户端访问认证接口的权限
     * 启动项目，如果你用的是 IDEA 会在下方的 Mapping 窗口中看到 oauth2 相关的 RESTful 接口
     * 主要有如下几个：
     * （1）POST      /oauth/authorize        授权码模式认证授权接口
     * （2）GET/POST  /oauth/token            获取 token 的接口
     * （3）POST      /oauth/check_token      检查 token 合法性接口
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        // 允许客户端访问 OAuth2 授权接口，否则请求 token 会返回 401
        security.allowFormAuthenticationForClients();
        // 允许已授权用户访问 checkToken 接口
        security.checkTokenAccess("isAuthenticated()");
        // 允许已授权用户访问 获取 token 接口
        security.tokenKeyAccess("isAuthenticated()");
    }
}
