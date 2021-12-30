package com.qinfagroup.platform.generator.controller;

import com.qinfagroup.platform.common.restful.ResponseData;
import com.qinfagroup.platform.generator.service.DataTableService;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 代码生成器API接口
 * 
 * @author peng.zhao
 */
@RestController
public class CodeController {

	@Resource
	private DataTableService dataTableService;

	/**
	 * 获取代码文件
	 */
	@RequestMapping("/codeFile/{schemaName}/{tableNames}")
	public ResponseData<byte[]> code(@PathVariable("schemaName") String schemaName,
									 @PathVariable(value = "tableNames", required = false) final List<String> tableNames){
//		byte[] data = dataTableService.getCodeFile(schemaName, tableNames);
//		response.reset();
//        response.setHeader("Content-Disposition", "attachment; filename=\"code.zip\"");
//        response.addHeader("Content-Length", "" + data.length);
//        response.setContentType("application/octet-stream; charset=UTF-8");
//        IOUtils.write(data, response.getOutputStream());
		return null;
	}
}
