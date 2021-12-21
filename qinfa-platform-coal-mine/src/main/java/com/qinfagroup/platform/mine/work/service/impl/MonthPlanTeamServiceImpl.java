package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.MonthPlanTeamDao;
import com.qinfagroup.platform.mine.work.entity.MonthPlanTeamEntity;
import com.qinfagroup.platform.mine.work.service.MonthPlanTeamService;


@Service("monthPlanTeamService")
public class MonthPlanTeamServiceImpl extends ServiceImpl<MonthPlanTeamDao, MonthPlanTeamEntity> implements MonthPlanTeamService {

    @Override
    public PageData<MonthPlanTeamEntity> queryPage(Map<String, Object> params) {
        IPage<MonthPlanTeamEntity> page = this.page(
            new Query<MonthPlanTeamEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}