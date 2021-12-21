package com.qinfagroup.platform.mine.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.base.dao.WorkTeamTypeDao;
import com.qinfagroup.platform.mine.base.entity.WorkTeamTypeEntity;
import com.qinfagroup.platform.mine.base.service.WorkTeamTypeService;


@Service("workTeamTypeService")
public class WorkTeamTypeServiceImpl extends ServiceImpl<WorkTeamTypeDao, WorkTeamTypeEntity> implements WorkTeamTypeService {

    @Override
    public PageData queryPage(Map<String, Object> params) {
        IPage<WorkTeamTypeEntity> page = this.page(
                new Query<WorkTeamTypeEntity>().getPage(params),
                new QueryWrapper<WorkTeamTypeEntity>()
        );

        return new PageData(page);
    }

}