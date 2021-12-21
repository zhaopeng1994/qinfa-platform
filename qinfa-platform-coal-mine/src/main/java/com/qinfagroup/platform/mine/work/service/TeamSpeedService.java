package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.TeamSpeedEntity;

import java.util.Map;

/**
 * 施工单位进度表
 *
 * @date 2021-12-21 22:55:50
 */
public interface TeamSpeedService extends IService<TeamSpeedEntity> {

    PageData<TeamSpeedEntity> queryPage(Map<String, Object> params);
}

