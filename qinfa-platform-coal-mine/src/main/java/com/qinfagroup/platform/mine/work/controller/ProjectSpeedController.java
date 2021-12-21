package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.ProjectSpeedEntity;
import com.qinfagroup.platform.mine.work.service.ProjectSpeedService;

/**
 * 工作面进度表 - 控制器
 */
@RestController
@RequestMapping("work/projectSpeed")
public class ProjectSpeedController {

    @Autowired
    private ProjectSpeedService projectSpeedService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<ProjectSpeedEntity>> list(@RequestParam Map<String, Object> params){
        PageData<ProjectSpeedEntity> page = projectSpeedService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{planId}")
    public ResponseData<ProjectSpeedEntity> info(@PathVariable("planId") Long planId){
		ProjectSpeedEntity projectSpeed = projectSpeedService.getById(planId);
        return ResponseData.success(projectSpeed);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody ProjectSpeedEntity projectSpeed){
		projectSpeedService.save(projectSpeed);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody ProjectSpeedEntity projectSpeed){
		projectSpeedService.updateById(projectSpeed);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] planIds){
		projectSpeedService.removeByIds(Arrays.asList(planIds));
        return ResponseData.success(null);
    }

}
