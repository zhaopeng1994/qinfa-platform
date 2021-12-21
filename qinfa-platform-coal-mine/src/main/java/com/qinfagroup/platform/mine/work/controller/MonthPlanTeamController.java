package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.MonthPlanTeamEntity;
import com.qinfagroup.platform.mine.work.service.MonthPlanTeamService;

/**
 * 月计划施工队明细表 - 控制器
 */
@RestController
@RequestMapping("work/monthPlanTeam")
public class MonthPlanTeamController {

    @Autowired
    private MonthPlanTeamService monthPlanTeamService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<MonthPlanTeamEntity>> list(@RequestParam Map<String, Object> params){
        PageData<MonthPlanTeamEntity> page = monthPlanTeamService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{planId}")
    public ResponseData<MonthPlanTeamEntity> info(@PathVariable("planId") Long planId){
		MonthPlanTeamEntity monthPlanTeam = monthPlanTeamService.getById(planId);
        return ResponseData.success(monthPlanTeam);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody MonthPlanTeamEntity monthPlanTeam){
		monthPlanTeamService.save(monthPlanTeam);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody MonthPlanTeamEntity monthPlanTeam){
		monthPlanTeamService.updateById(monthPlanTeam);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] planIds){
		monthPlanTeamService.removeByIds(Arrays.asList(planIds));
        return ResponseData.success(null);
    }

}
