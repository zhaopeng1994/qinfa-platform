package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.MonthPlanTeamEntity;

import java.util.Map;

/**
 * 月计划施工队明细表
 *
 * @date 2021-12-21 22:55:51
 */
public interface MonthPlanTeamService extends IService<MonthPlanTeamEntity> {

    PageData<MonthPlanTeamEntity> queryPage(Map<String, Object> params);
}

