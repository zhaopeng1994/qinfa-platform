

package com.qinfagroup.platform.admin.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.admin.common.utils.PageUtils;
import com.qinfagroup.platform.admin.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 *
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
