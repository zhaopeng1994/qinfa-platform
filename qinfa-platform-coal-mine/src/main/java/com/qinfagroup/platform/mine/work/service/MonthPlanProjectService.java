package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.MonthPlanProjectEntity;

import java.util.Map;

/**
 * 月计划工作面明细表
 *
 * @date 2021-12-21 22:55:51
 */
public interface MonthPlanProjectService extends IService<MonthPlanProjectEntity> {

    PageData<MonthPlanProjectEntity> queryPage(Map<String, Object> params);
}

