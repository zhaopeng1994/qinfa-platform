package com.qinfagroup.platform.generator.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.generator.dao.DataTableDao;
import com.qinfagroup.platform.generator.model.DataTablePo;
import com.qinfagroup.platform.generator.model.DataTableQueryVo;
import com.qinfagroup.platform.generator.util.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据表服务类
 * @author peng.zhao
 */
@Service
public class DataTableService {

    @Autowired
    private DataTableDao dataTableDao;


    /**
     * 分页查询
     */
    public PageData<DataTablePo> selectDataTables(QueryParam<DataTableQueryVo> queryParam) {
        Page<?> page = PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        String schemaName = queryParam.getRequestVo().getSchemaName();
        String tableName = queryParam.getRequestVo().getTableName();
        List<DataTablePo> dataTables = dataTableDao.selectDataTables(schemaName, tableName);
        int total = (int) page.getTotal();
        return new PageData<>(dataTables, total, page.getPageSize(), queryParam.getPage());
    }
}
