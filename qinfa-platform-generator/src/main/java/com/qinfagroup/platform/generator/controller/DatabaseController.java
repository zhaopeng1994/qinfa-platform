package com.qinfagroup.platform.generator.controller;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.PagingRequestParam;
import com.qinfagroup.platform.common.restful.ResponseData;
import com.qinfagroup.platform.generator.entity.SchemaEntity;
import com.qinfagroup.platform.generator.model.DataTablePo;
import com.qinfagroup.platform.generator.model.DataTableRequestVo;
import com.qinfagroup.platform.generator.service.DatabaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 数据表API接口
 * 
 * @author peng.zhao
 */
@RestController
@RequestMapping("/database")
public class DatabaseController {

	@Resource
	private DatabaseService databaseService;

	@PostMapping("/dataTables/{page}/{pageSize}")
	public ResponseData<PageData<DataTablePo>> selectDataTables(@PathVariable("page") int page,
													@PathVariable("pageSize") int pageSize,
													@RequestBody @Valid DataTableRequestVo dataTableRequestVo){
		PagingRequestParam<DataTableRequestVo> pagingRequestParam = new PagingRequestParam<>(page, pageSize, dataTableRequestVo);
		PageData<DataTablePo> pageData = databaseService.selectDataTables(pagingRequestParam);
		return ResponseData.success(pageData);
	}

	@PostMapping("/schema")
	public ResponseData<Object> insertSchema(@RequestBody @Valid SchemaEntity schemaEntity) {

		return ResponseData.success(null);
	}

	// TODO 查询Schema列表
	@GetMapping("/schemas")
	public ResponseData<List<SchemaEntity>> selectSchemas() {
		return ResponseData.success(null);
	}



}
