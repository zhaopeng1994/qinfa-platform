package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.ProjectSumEntity;

import java.util.Map;

/**
 * 工作面月度汇总表
 *
 * @date 2021-12-21 22:55:50
 */
public interface ProjectSumService extends IService<ProjectSumEntity> {

    PageData<ProjectSumEntity> queryPage(Map<String, Object> params);
}

