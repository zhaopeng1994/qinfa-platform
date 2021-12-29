package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.MonthPlanDao;
import com.qinfagroup.platform.mine.work.entity.MonthPlanEntity;
import com.qinfagroup.platform.mine.work.service.MonthPlanService;


@Service("monthPlanService")
public class MonthPlanServiceImpl extends ServiceImpl<MonthPlanDao, MonthPlanEntity> implements MonthPlanService {

    @Override
    public PageData<MonthPlanEntity> queryPage(Map<String, Object> params) {
        IPage<MonthPlanEntity> page = this.page(
                new Query<MonthPlanEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}