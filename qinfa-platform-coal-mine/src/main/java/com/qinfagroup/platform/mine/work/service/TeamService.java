package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.TeamEntity;

import java.util.Map;

/**
 * 施工单位表
 *
 * @date 2021-12-21 22:55:51
 */
public interface TeamService extends IService<TeamEntity> {

    PageData<TeamEntity> queryPage(Map<String, Object> params);
}

