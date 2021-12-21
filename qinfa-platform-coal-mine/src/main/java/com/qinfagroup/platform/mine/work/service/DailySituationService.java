package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.DailySituationEntity;

import java.util.Map;

/**
 * 日生产情况表
 *
 * @date 2021-12-21 22:55:50
 */
public interface DailySituationService extends IService<DailySituationEntity> {

    PageData<DailySituationEntity> queryPage(Map<String, Object> params);
}

