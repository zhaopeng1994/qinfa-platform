package com.qinfagroup.platform.mine.work.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.work.entity.BusinessEntity;
import com.qinfagroup.platform.mine.work.service.BusinessService;

/**
 * 开采业务表 - 控制器
 */
@RestController
@RequestMapping("work/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData<BusinessEntity>> list(@RequestParam Map<String, Object> params){
        PageData<BusinessEntity> page = businessService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{coalMineId}")
    public ResponseData<BusinessEntity> info(@PathVariable("coalMineId") Long coalMineId){
		BusinessEntity business = businessService.getById(coalMineId);
        return ResponseData.success(business);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody BusinessEntity business){
		businessService.save(business);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody BusinessEntity business){
		businessService.updateById(business);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody Long[] coalMineIds){
		businessService.removeByIds(Arrays.asList(coalMineIds));
        return ResponseData.success(null);
    }

}
