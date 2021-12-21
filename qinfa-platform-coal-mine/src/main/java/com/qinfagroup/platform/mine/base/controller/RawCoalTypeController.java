package com.qinfagroup.platform.mine.base.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.base.entity.RawCoalTypeEntity;
import com.qinfagroup.platform.mine.base.service.RawCoalTypeService;

/**
 * 原煤类型基表 - 控制器
 */
@RestController
@RequestMapping("base/rawCoalType")
public class RawCoalTypeController {

    @Autowired
    private RawCoalTypeService rawCoalTypeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<RawCoalTypeEntity>> list(@RequestParam Map<String, Object> params){
        PageData<RawCoalTypeEntity> page = rawCoalTypeService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{name}")
    public ResponseData<RawCoalTypeEntity> info(@PathVariable("name") String name){
		RawCoalTypeEntity rawCoalType = rawCoalTypeService.getById(name);
        return ResponseData.success(rawCoalType);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody RawCoalTypeEntity rawCoalType){
		rawCoalTypeService.save(rawCoalType);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody RawCoalTypeEntity rawCoalType){
		rawCoalTypeService.updateById(rawCoalType);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody String[] names){
		rawCoalTypeService.removeByIds(Arrays.asList(names));
        return ResponseData.success(null);
    }

}
