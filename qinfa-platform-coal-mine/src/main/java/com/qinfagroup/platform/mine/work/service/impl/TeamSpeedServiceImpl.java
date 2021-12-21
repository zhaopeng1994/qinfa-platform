package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.TeamSpeedDao;
import com.qinfagroup.platform.mine.work.entity.TeamSpeedEntity;
import com.qinfagroup.platform.mine.work.service.TeamSpeedService;


@Service("teamSpeedService")
public class TeamSpeedServiceImpl extends ServiceImpl<TeamSpeedDao, TeamSpeedEntity> implements TeamSpeedService {

    @Override
    public PageData<TeamSpeedEntity> queryPage(Map<String, Object> params) {
        IPage<TeamSpeedEntity> page = this.page(
            new Query<TeamSpeedEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}