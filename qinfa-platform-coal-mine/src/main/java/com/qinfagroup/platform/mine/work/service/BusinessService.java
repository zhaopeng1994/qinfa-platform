package com.qinfagroup.platform.mine.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.mine.work.entity.BusinessEntity;

import java.util.Map;

/**
 * 开采业务表
 *
 * @date 2021-12-21 22:55:51
 */
public interface BusinessService extends IService<BusinessEntity> {

    PageData<BusinessEntity> queryPage(Map<String, Object> params);
}

