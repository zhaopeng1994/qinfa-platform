package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.DailySituationEntity;
import com.qinfagroup.platform.mine.work.service.DailySituationService;

/**
 * 日生产情况表 - 控制器
 */
@RestController
@RequestMapping("work/dailySituation")
public class DailySituationController {

    @Autowired
    private DailySituationService dailySituationService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<DailySituationEntity>> list(@RequestParam Map<String, Object> params){
        PageData<DailySituationEntity> page = dailySituationService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{businessId}")
    public ResponseData<DailySituationEntity> info(@PathVariable("businessId") Long businessId){
		DailySituationEntity dailySituation = dailySituationService.getById(businessId);
        return ResponseData.success(dailySituation);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody DailySituationEntity dailySituation){
		dailySituationService.save(dailySituation);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody DailySituationEntity dailySituation){
		dailySituationService.updateById(dailySituation);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] businessIds){
		dailySituationService.removeByIds(Arrays.asList(businessIds));
        return ResponseData.success(null);
    }

}
