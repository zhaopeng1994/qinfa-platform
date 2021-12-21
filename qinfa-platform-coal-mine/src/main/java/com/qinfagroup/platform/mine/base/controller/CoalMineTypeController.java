package com.qinfagroup.platform.mine.base.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.base.entity.CoalMineTypeEntity;
import com.qinfagroup.platform.mine.base.service.CoalMineTypeService;

/**
 * 煤矿类型基表 - 控制器
 */
@RestController
@RequestMapping("base/coalMineType")
public class CoalMineTypeController {

    @Autowired
    private CoalMineTypeService coalMineTypeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData> list(@RequestParam Map<String, Object> params){
        PageData page = coalMineTypeService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{name}")
    public ResponseData<CoalMineTypeEntity> info(@PathVariable("name") String name){
		CoalMineTypeEntity coalMineType = coalMineTypeService.getById(name);
        return ResponseData.success(coalMineType);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody CoalMineTypeEntity coalMineType){
		coalMineTypeService.save(coalMineType);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody CoalMineTypeEntity coalMineType){
		coalMineTypeService.updateById(coalMineType);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody String[] names){
		coalMineTypeService.removeByIds(Arrays.asList(names));
        return ResponseData.success(null);
    }

}
