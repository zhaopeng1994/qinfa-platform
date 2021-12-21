package com.qinfagroup.platform.mine.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.base.dao.ProjectTypeDao;
import com.qinfagroup.platform.mine.base.entity.ProjectTypeEntity;
import com.qinfagroup.platform.mine.base.service.ProjectTypeService;


@Service("projectTypeService")
public class ProjectTypeServiceImpl extends ServiceImpl<ProjectTypeDao, ProjectTypeEntity> implements ProjectTypeService {

    @Override
    public PageData queryPage(Map<String, Object> params) {
        IPage<ProjectTypeEntity> page = this.page(
                new Query<ProjectTypeEntity>().getPage(params),
                new QueryWrapper<ProjectTypeEntity>()
        );

        return new PageData(page);
    }

}