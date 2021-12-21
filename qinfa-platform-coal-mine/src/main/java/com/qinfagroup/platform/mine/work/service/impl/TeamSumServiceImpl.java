package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.TeamSumDao;
import com.qinfagroup.platform.mine.work.entity.TeamSumEntity;
import com.qinfagroup.platform.mine.work.service.TeamSumService;


@Service("teamSumService")
public class TeamSumServiceImpl extends ServiceImpl<TeamSumDao, TeamSumEntity> implements TeamSumService {

    @Override
    public PageData<TeamSumEntity> queryPage(Map<String, Object> params) {
        IPage<TeamSumEntity> page = this.page(
            new Query<TeamSumEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}