package com.qinfagroup.platform.mine.work.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.Query;

import com.qinfagroup.platform.mine.work.dao.DailySituationDao;
import com.qinfagroup.platform.mine.work.entity.DailySituationEntity;
import com.qinfagroup.platform.mine.work.service.DailySituationService;


@Service("dailySituationService")
public class DailySituationServiceImpl extends ServiceImpl<DailySituationDao, DailySituationEntity> implements DailySituationService {

    @Override
    public PageData<DailySituationEntity> queryPage(Map<String, Object> params) {
        IPage<DailySituationEntity> page = this.page(
            new Query<DailySituationEntity>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageData<>(page);
    }

}