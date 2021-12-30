package com.qinfagroup.platform.generator.controller;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.PagingRequestParam;
import com.qinfagroup.platform.common.restful.ResponseData;
import com.qinfagroup.platform.generator.model.DataTablePo;
import com.qinfagroup.platform.generator.model.DataTableRequestVo;
import com.qinfagroup.platform.generator.service.DataTableService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 数据表API接口
 * 
 * @author peng.zhao
 */
@RestController
public class DataTableController {

	@Resource
	private DataTableService dataTableService;

	/**
	 * 数据表查询
	 */
	@PostMapping("/dataTables/{page}/{pageSize}")
	public ResponseData<PageData<DataTablePo>> list(@PathVariable("page") int page,
													@PathVariable("pageSize") int pageSize,
													@RequestBody @Valid DataTableRequestVo dataTableRequestVo){
		PagingRequestParam<DataTableRequestVo> pagingRequestParam = new PagingRequestParam<>(page, pageSize, dataTableRequestVo);
		PageData<DataTablePo> pageData = dataTableService.selectDataTables(pagingRequestParam);
		return ResponseData.success(pageData);
	}

}
