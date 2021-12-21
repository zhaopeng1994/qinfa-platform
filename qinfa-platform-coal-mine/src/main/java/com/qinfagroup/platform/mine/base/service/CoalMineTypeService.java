package com.qinfagroup.platform.mine.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.base.entity.CoalMineTypeEntity;

import java.util.Map;

/**
 * 煤矿类型基表
 *
 * @date 2021-12-21 20:16:29
 */
public interface CoalMineTypeService extends IService<CoalMineTypeEntity> {

    PageData queryPage(Map<String, Object> params);
}

