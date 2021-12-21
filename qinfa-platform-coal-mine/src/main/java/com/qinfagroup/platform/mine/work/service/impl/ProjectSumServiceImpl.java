package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.ProjectSumDao;
import com.qinfagroup.platform.mine.work.entity.ProjectSumEntity;
import com.qinfagroup.platform.mine.work.service.ProjectSumService;


@Service("projectSumService")
public class ProjectSumServiceImpl extends ServiceImpl<ProjectSumDao, ProjectSumEntity> implements ProjectSumService {

    @Override
    public PageData<ProjectSumEntity> queryPage(Map<String, Object> params) {
        IPage<ProjectSumEntity> page = this.page(
            new Query<ProjectSumEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}