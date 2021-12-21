package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.ProjectSumEntity;
import com.qinfagroup.platform.mine.work.service.ProjectSumService;

/**
 * 工作面月度汇总表 - 控制器
 */
@RestController
@RequestMapping("work/projectSum")
public class ProjectSumController {

    @Autowired
    private ProjectSumService projectSumService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<ProjectSumEntity>> list(@RequestParam Map<String, Object> params){
        PageData<ProjectSumEntity> page = projectSumService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{planId}")
    public ResponseData<ProjectSumEntity> info(@PathVariable("planId") Long planId){
		ProjectSumEntity projectSum = projectSumService.getById(planId);
        return ResponseData.success(projectSum);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody ProjectSumEntity projectSum){
		projectSumService.save(projectSum);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody ProjectSumEntity projectSum){
		projectSumService.updateById(projectSum);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] planIds){
		projectSumService.removeByIds(Arrays.asList(planIds));
        return ResponseData.success(null);
    }

}
