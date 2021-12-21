package com.qinfagroup.platform.mine.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.base.dao.CoalMineDao;
import com.qinfagroup.platform.mine.base.entity.CoalMineEntity;
import com.qinfagroup.platform.mine.base.service.CoalMineService;


@Service("coalMineService")
public class CoalMineServiceImpl extends ServiceImpl<CoalMineDao, CoalMineEntity> implements CoalMineService {

    @Override
    public PageData<CoalMineEntity> queryPage(Map<String, Object> params) {
        IPage<CoalMineEntity> page = this.page(
                new Query<CoalMineEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}