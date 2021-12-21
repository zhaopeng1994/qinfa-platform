package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.ProjectEntity;

import java.util.Map;

/**
 * 施工项目表
 *
 * @date 2021-12-21 22:55:51
 */
public interface ProjectService extends IService<ProjectEntity> {

    PageData<ProjectEntity> queryPage(Map<String, Object> params);
}

