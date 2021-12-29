package com.qinfagroup.platform.generator.controller;

import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.restful.ResponseData;
import com.qinfagroup.platform.generator.model.DataTablePo;
import com.qinfagroup.platform.generator.model.DataTableQueryVo;
import com.qinfagroup.platform.generator.service.DataTableService;
import com.qinfagroup.platform.generator.util.QueryParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 数据表API接口
 * 
 * @author peng.zhao
 */
@RestController
@RequestMapping("/dataTable")
public class DataTableController {

	@Resource
	private DataTableService dataTableService;

	/**
	 * 数据表查询
	 */
	@ResponseBody
	@PostMapping("/list/{page}/{pageSize}")
	public ResponseData<PageData<DataTablePo>> list(@PathVariable("page") int page,
													@PathVariable("pageSize") int pageSize,
													@RequestBody @Valid DataTableQueryVo dataTableQueryVo){
		QueryParam<DataTableQueryVo> queryParam = new QueryParam<>(page, pageSize, dataTableQueryVo);
		PageData<DataTablePo> pageData = dataTableService.selectDataTables(queryParam);
		return ResponseData.success(pageData);
	}
	
//	/**
//	 * 生成代码
//	 */
//	@RequestMapping("/code")
//	public void code(String tables, HttpServletResponse response) throws IOException{
//		byte[] data = sysGeneratorService.generatorCode(tables.split(","));
//		response.reset();
//        response.setHeader("Content-Disposition", "attachment; filename=\"code.zip\"");
//        response.addHeader("Content-Length", "" + data.length);
//        response.setContentType("application/octet-stream; charset=UTF-8");
//        IOUtils.write(data, response.getOutputStream());
//	}
}
