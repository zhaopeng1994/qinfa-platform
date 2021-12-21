package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.TeamDao;
import com.qinfagroup.platform.mine.work.entity.TeamEntity;
import com.qinfagroup.platform.mine.work.service.TeamService;


@Service("teamService")
public class TeamServiceImpl extends ServiceImpl<TeamDao, TeamEntity> implements TeamService {

    @Override
    public PageData<TeamEntity> queryPage(Map<String, Object> params) {
        IPage<TeamEntity> page = this.page(
            new Query<TeamEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}