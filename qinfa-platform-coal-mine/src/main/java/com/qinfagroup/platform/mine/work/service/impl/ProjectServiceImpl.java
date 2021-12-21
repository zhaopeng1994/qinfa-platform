package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.ProjectDao;
import com.qinfagroup.platform.mine.work.entity.ProjectEntity;
import com.qinfagroup.platform.mine.work.service.ProjectService;


@Service("projectService")
public class ProjectServiceImpl extends ServiceImpl<ProjectDao, ProjectEntity> implements ProjectService {

    @Override
    public PageData<ProjectEntity> queryPage(Map<String, Object> params) {
        IPage<ProjectEntity> page = this.page(
            new Query<ProjectEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}