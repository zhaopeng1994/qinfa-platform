package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.MonthPlanProjectDao;
import com.qinfagroup.platform.mine.work.entity.MonthPlanProjectEntity;
import com.qinfagroup.platform.mine.work.service.MonthPlanProjectService;


@Service("monthPlanProjectService")
public class MonthPlanProjectServiceImpl extends ServiceImpl<MonthPlanProjectDao, MonthPlanProjectEntity> implements MonthPlanProjectService {

    @Override
    public PageData<MonthPlanProjectEntity> queryPage(Map<String, Object> params) {
        IPage<MonthPlanProjectEntity> page = this.page(
            new Query<MonthPlanProjectEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}