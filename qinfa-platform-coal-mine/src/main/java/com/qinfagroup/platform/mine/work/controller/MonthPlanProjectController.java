package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.MonthPlanProjectEntity;
import com.qinfagroup.platform.mine.work.service.MonthPlanProjectService;

/**
 * 月计划工作面明细表 - 控制器
 */
@RestController
@RequestMapping("work/monthPlanProject")
public class MonthPlanProjectController {

    @Autowired
    private MonthPlanProjectService monthPlanProjectService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<MonthPlanProjectEntity>> list(@RequestParam Map<String, Object> params){
        PageData<MonthPlanProjectEntity> page = monthPlanProjectService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{planId}")
    public ResponseData<MonthPlanProjectEntity> info(@PathVariable("planId") Long planId){
		MonthPlanProjectEntity monthPlanProject = monthPlanProjectService.getById(planId);
        return ResponseData.success(monthPlanProject);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody MonthPlanProjectEntity monthPlanProject){
		monthPlanProjectService.save(monthPlanProject);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody MonthPlanProjectEntity monthPlanProject){
		monthPlanProjectService.updateById(monthPlanProject);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] planIds){
		monthPlanProjectService.removeByIds(Arrays.asList(planIds));
        return ResponseData.success(null);
    }

}
