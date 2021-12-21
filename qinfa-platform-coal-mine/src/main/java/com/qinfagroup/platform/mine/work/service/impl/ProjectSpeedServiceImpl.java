package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.ProjectSpeedDao;
import com.qinfagroup.platform.mine.work.entity.ProjectSpeedEntity;
import com.qinfagroup.platform.mine.work.service.ProjectSpeedService;


@Service("projectSpeedService")
public class ProjectSpeedServiceImpl extends ServiceImpl<ProjectSpeedDao, ProjectSpeedEntity> implements ProjectSpeedService {

    @Override
    public PageData<ProjectSpeedEntity> queryPage(Map<String, Object> params) {
        IPage<ProjectSpeedEntity> page = this.page(
            new Query<ProjectSpeedEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}