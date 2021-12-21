package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.ProjectSpeedEntity;

import java.util.Map;

/**
 * 工作面进度表
 *
 * @date 2021-12-21 22:55:50
 */
public interface ProjectSpeedService extends IService<ProjectSpeedEntity> {

    PageData<ProjectSpeedEntity> queryPage(Map<String, Object> params);
}

