package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.BusinessDao;
import com.qinfagroup.platform.mine.work.entity.BusinessEntity;
import com.qinfagroup.platform.mine.work.service.BusinessService;


@Service("businessService")
public class BusinessServiceImpl extends ServiceImpl<BusinessDao, BusinessEntity> implements BusinessService {

    @Override
    public PageData<BusinessEntity> queryPage(Map<String, Object> params) {
        IPage<BusinessEntity> page = this.page(
            new Query<BusinessEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}