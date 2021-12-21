package com.qinfagroup.platform.mine.base.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.base.entity.ProjectTypeEntity;
import com.qinfagroup.platform.mine.base.service.ProjectTypeService;

/**
 * 项目类型基表 - 控制器
 */
@RestController
@RequestMapping("base/projectType")
public class ProjectTypeController {

    @Autowired
    private ProjectTypeService projectTypeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<ProjectTypeEntity>> list(@RequestParam Map<String, Object> params){
        PageData<ProjectTypeEntity> page = projectTypeService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{name}")
    public ResponseData<ProjectTypeEntity> info(@PathVariable("name") String name){
		ProjectTypeEntity projectType = projectTypeService.getById(name);
        return ResponseData.success(projectType);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody ProjectTypeEntity projectType){
		projectTypeService.save(projectType);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody ProjectTypeEntity projectType){
		projectTypeService.updateById(projectType);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody String[] names){
		projectTypeService.removeByIds(Arrays.asList(names));
        return ResponseData.success(null);
    }

}
