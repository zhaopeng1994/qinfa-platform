package com.qinfagroup.platform.mine.base.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.base.entity.WorkTeamTypeEntity;
import com.qinfagroup.platform.mine.base.service.WorkTeamTypeService;

/**
 * 施工单位类型基表 - 控制器
 */
@RestController
@RequestMapping("base/workTeamType")
public class WorkTeamTypeController {

    @Autowired
    private WorkTeamTypeService workTeamTypeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<WorkTeamTypeEntity>> list(@RequestParam Map<String, Object> params){
        PageData<WorkTeamTypeEntity> page = workTeamTypeService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{name}")
    public ResponseData<WorkTeamTypeEntity> info(@PathVariable("name") String name){
		WorkTeamTypeEntity workTeamType = workTeamTypeService.getById(name);
        return ResponseData.success(workTeamType);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody WorkTeamTypeEntity workTeamType){
		workTeamTypeService.save(workTeamType);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody WorkTeamTypeEntity workTeamType){
		workTeamTypeService.updateById(workTeamType);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody String[] names){
		workTeamTypeService.removeByIds(Arrays.asList(names));
        return ResponseData.success(null);
    }

}
