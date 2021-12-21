package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.MonthPlanEntity;

import java.util.Map;

/**
 * 月计划表
 *
 * @date 2021-12-21 22:55:50
 */
public interface MonthPlanService extends IService<MonthPlanEntity> {

    PageData<MonthPlanEntity> queryPage(Map<String, Object> params);
}

