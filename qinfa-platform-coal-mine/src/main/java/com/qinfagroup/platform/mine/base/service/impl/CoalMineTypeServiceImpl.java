package com.qinfagroup.platform.mine.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.base.dao.CoalMineTypeDao;
import com.qinfagroup.platform.mine.base.entity.CoalMineTypeEntity;
import com.qinfagroup.platform.mine.base.service.CoalMineTypeService;


@Service("coalMineTypeService")
public class CoalMineTypeServiceImpl extends ServiceImpl<CoalMineTypeDao, CoalMineTypeEntity> implements CoalMineTypeService {

    @Override
    public PageData queryPage(Map<String, Object> params) {
        IPage<CoalMineTypeEntity> page = this.page(
                new Query<CoalMineTypeEntity>().getPage(params),
                new QueryWrapper<CoalMineTypeEntity>()
        );

        return new PageData(page);
    }

}