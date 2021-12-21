package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.TeamSumEntity;
import com.qinfagroup.platform.mine.work.service.TeamSumService;

/**
 * 施工单位月度汇总表 - 控制器
 */
@RestController
@RequestMapping("work/teamSum")
public class TeamSumController {

    @Autowired
    private TeamSumService teamSumService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<TeamSumEntity>> list(@RequestParam Map<String, Object> params){
        PageData<TeamSumEntity> page = teamSumService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{planId}")
    public ResponseData<TeamSumEntity> info(@PathVariable("planId") Long planId){
		TeamSumEntity teamSum = teamSumService.getById(planId);
        return ResponseData.success(teamSum);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody TeamSumEntity teamSum){
		teamSumService.save(teamSum);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody TeamSumEntity teamSum){
		teamSumService.updateById(teamSum);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] planIds){
		teamSumService.removeByIds(Arrays.asList(planIds));
        return ResponseData.success(null);
    }

}
