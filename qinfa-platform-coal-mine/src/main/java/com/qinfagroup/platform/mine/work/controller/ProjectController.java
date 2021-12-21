package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.ProjectEntity;
import com.qinfagroup.platform.mine.work.service.ProjectService;

/**
 * 施工项目表 - 控制器
 */
@RestController
@RequestMapping("work/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<ProjectEntity>> list(@RequestParam Map<String, Object> params){
        PageData<ProjectEntity> page = projectService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{businessId}")
    public ResponseData<ProjectEntity> info(@PathVariable("businessId") Long businessId){
		ProjectEntity project = projectService.getById(businessId);
        return ResponseData.success(project);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody ProjectEntity project){
		projectService.save(project);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody ProjectEntity project){
		projectService.updateById(project);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] businessIds){
		projectService.removeByIds(Arrays.asList(businessIds));
        return ResponseData.success(null);
    }

}
