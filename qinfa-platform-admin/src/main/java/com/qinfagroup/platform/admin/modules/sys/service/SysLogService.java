

package com.qinfagroup.platform.admin.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.admin.common.utils.PageUtils;
import com.qinfagroup.platform.admin.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 *
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
