package com.qinfagroup.platform.mine.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.base.dao.CoalRockTypeDao;
import com.qinfagroup.platform.mine.base.entity.CoalRockTypeEntity;
import com.qinfagroup.platform.mine.base.service.CoalRockTypeService;


@Service("coalRockTypeService")
public class CoalRockTypeServiceImpl extends ServiceImpl<CoalRockTypeDao, CoalRockTypeEntity> implements CoalRockTypeService {

    @Override
    public PageData queryPage(Map<String, Object> params) {
        IPage<CoalRockTypeEntity> page = this.page(
                new Query<CoalRockTypeEntity>().getPage(params),
                new QueryWrapper<CoalRockTypeEntity>()
        );

        return new PageData(page);
    }

}