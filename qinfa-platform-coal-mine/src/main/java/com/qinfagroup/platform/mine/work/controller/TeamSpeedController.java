package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.TeamSpeedEntity;
import com.qinfagroup.platform.mine.work.service.TeamSpeedService;

/**
 * 施工单位进度表 - 控制器
 */
@RestController
@RequestMapping("work/teamSpeed")
public class TeamSpeedController {

    @Autowired
    private TeamSpeedService teamSpeedService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<TeamSpeedEntity>> list(@RequestParam Map<String, Object> params){
        PageData<TeamSpeedEntity> page = teamSpeedService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{planId}")
    public ResponseData<TeamSpeedEntity> info(@PathVariable("planId") Long planId){
		TeamSpeedEntity teamSpeed = teamSpeedService.getById(planId);
        return ResponseData.success(teamSpeed);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody TeamSpeedEntity teamSpeed){
		teamSpeedService.save(teamSpeed);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody TeamSpeedEntity teamSpeed){
		teamSpeedService.updateById(teamSpeed);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] planIds){
		teamSpeedService.removeByIds(Arrays.asList(planIds));
        return ResponseData.success(null);
    }

}
