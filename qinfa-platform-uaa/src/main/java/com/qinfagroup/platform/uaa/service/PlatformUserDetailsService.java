package com.qinfagroup.platform.uaa.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现用户身份认证的服务类
 *
 * @author peng.zhao
 */
@Slf4j
@Service
public class PlatformUserDetailsService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    public PlatformUserDetailsService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("PlatformUserDetailsService.loadUserByUsername:{}", username);
        // 查询数据库操作
        if ("admin".equals(username)) {
            throw new UsernameNotFoundException("the user is not found");
        } else {
            // 用户角色也应在数据库中获取
            String role = "ADMIN_ROLE";
            List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority(role));
            // 线上环境应该通过用户名查询数据获取加密后的密码
            String password = passwordEncoder.encode("123456");
            return new User(username, password, authorities);
        }
    }
}
