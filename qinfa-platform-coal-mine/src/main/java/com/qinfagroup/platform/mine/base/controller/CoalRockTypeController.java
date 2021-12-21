package com.qinfagroup.platform.mine.base.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.base.entity.CoalRockTypeEntity;
import com.qinfagroup.platform.mine.base.service.CoalRockTypeService;

/**
 * 煤岩类型基表 - 控制器
 */
@RestController
@RequestMapping("base/coalRockType")
public class CoalRockTypeController {

    @Autowired
    private CoalRockTypeService coalRockTypeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<CoalRockTypeEntity>> list(@RequestParam Map<String, Object> params){
        PageData<CoalRockTypeEntity> page = coalRockTypeService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{name}")
    public ResponseData<CoalRockTypeEntity> info(@PathVariable("name") String name){
		CoalRockTypeEntity coalRockType = coalRockTypeService.getById(name);
        return ResponseData.success(coalRockType);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody CoalRockTypeEntity coalRockType){
		coalRockTypeService.save(coalRockType);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody CoalRockTypeEntity coalRockType){
		coalRockTypeService.updateById(coalRockType);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody String[] names){
		coalRockTypeService.removeByIds(Arrays.asList(names));
        return ResponseData.success(null);
    }

}
