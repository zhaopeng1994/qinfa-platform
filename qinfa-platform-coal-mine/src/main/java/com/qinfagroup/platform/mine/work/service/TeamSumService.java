package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.TeamSumEntity;

import java.util.Map;

/**
 * 施工单位月度汇总表
 *
 * @date 2021-12-21 22:55:50
 */
public interface TeamSumService extends IService<TeamSumEntity> {

    PageData<TeamSumEntity> queryPage(Map<String, Object> params);
}

