package com.qinfagroup.platform.mine.base.controller;

import java.util.Arrays;
import java.util.Map;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qinfagroup.platform.mine.base.entity.CoalMineEntity;
import com.qinfagroup.platform.mine.base.service.CoalMineService;

/**
 * 煤矿表 - 控制器
 */
@RestController
@RequestMapping("base/coalMine")
public class CoalMineController {

    @Autowired
    private CoalMineService coalMineService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public ResponseData<PageData> list(@RequestParam Map<String, Object> params){
        PageData page = coalMineService.queryPage(params);
        return ResponseData.success(page);
    }

    /**
     * 详情
     */
    @GetMapping("/info/{code}")
    public ResponseData<CoalMineEntity> info(@PathVariable("code") String code){
		CoalMineEntity coalMine = coalMineService.getById(code);
        return ResponseData.success(coalMine);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public ResponseData<Object> save(@RequestBody CoalMineEntity coalMine){
		coalMineService.save(coalMine);
        return ResponseData.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public ResponseData<Object> update(@RequestBody CoalMineEntity coalMine){
		coalMineService.updateById(coalMine);
        return ResponseData.success(null);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public ResponseData<Object> delete(@RequestBody String[] codes){
		coalMineService.removeByIds(Arrays.asList(codes));
        return ResponseData.success(null);
    }

}
