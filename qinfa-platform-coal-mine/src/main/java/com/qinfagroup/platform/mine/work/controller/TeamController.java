package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.TeamEntity;
import com.qinfagroup.platform.mine.work.service.TeamService;

/**
 * 施工单位表 - 控制器
 */
@RestController
@RequestMapping("work/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<TeamEntity>> list(@RequestParam Map<String, Object> params){
        PageData<TeamEntity> page = teamService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{businessId}")
    public ResponseData<TeamEntity> info(@PathVariable("businessId") Long businessId){
		TeamEntity team = teamService.getById(businessId);
        return ResponseData.success(team);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody TeamEntity team){
		teamService.save(team);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody TeamEntity team){
		teamService.updateById(team);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] businessIds){
		teamService.removeByIds(Arrays.asList(businessIds));
        return ResponseData.success(null);
    }

}
