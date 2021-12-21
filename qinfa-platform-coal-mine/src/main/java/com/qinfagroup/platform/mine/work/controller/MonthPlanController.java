package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.MonthPlanEntity;
import com.qinfagroup.platform.mine.work.service.MonthPlanService;

/**
 * 月计划表 - 控制器
 */
@RestController
@RequestMapping("work/monthPlan")
public class MonthPlanController {

    @Autowired
    private MonthPlanService monthPlanService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<MonthPlanEntity>> list(@RequestParam Map<String, Object> params){
        PageData<MonthPlanEntity> page = monthPlanService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{businessId}")
    public ResponseData<MonthPlanEntity> info(@PathVariable("businessId") Long businessId){
		MonthPlanEntity monthPlan = monthPlanService.getById(businessId);
        return ResponseData.success(monthPlan);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody MonthPlanEntity monthPlan){
		monthPlanService.save(monthPlan);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody MonthPlanEntity monthPlan){
		monthPlanService.updateById(monthPlan);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] businessIds){
		monthPlanService.removeByIds(Arrays.asList(businessIds));
        return ResponseData.success(null);
    }

}
