package com.qinfagroup.platform.mine.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.base.dao.RawCoalTypeDao;
import com.qinfagroup.platform.mine.base.entity.RawCoalTypeEntity;
import com.qinfagroup.platform.mine.base.service.RawCoalTypeService;


@Service("rawCoalTypeService")
public class RawCoalTypeServiceImpl extends ServiceImpl<RawCoalTypeDao, RawCoalTypeEntity> implements RawCoalTypeService {

    @Override
    public PageData queryPage(Map<String, Object> params) {
        IPage<RawCoalTypeEntity> page = this.page(
                new Query<RawCoalTypeEntity>().getPage(params),
                new QueryWrapper<RawCoalTypeEntity>()
        );

        return new PageData(page);
    }

}