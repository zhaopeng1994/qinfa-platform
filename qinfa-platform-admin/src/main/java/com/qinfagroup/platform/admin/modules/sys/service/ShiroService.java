

package com.qinfagroup.platform.admin.modules.sys.service;

import com.qinfagroup.platform.admin.modules.sys.entity.SysUserEntity;
import com.qinfagroup.platform.admin.modules.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 *
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
