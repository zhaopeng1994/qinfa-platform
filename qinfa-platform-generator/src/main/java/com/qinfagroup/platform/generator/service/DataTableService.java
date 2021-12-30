package com.qinfagroup.platform.generator.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qinfagroup.platform.common.page.PageData;
import com.qinfagroup.platform.common.page.PagingRequestParam;
import com.qinfagroup.platform.generator.dao.DataTableDao;
import com.qinfagroup.platform.generator.model.DataTablePo;
import com.qinfagroup.platform.generator.model.DataTableRequestVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据表服务类
 * @author peng.zhao
 */
@Service
public class DataTableService {

    private final DataTableDao dataTableDao;

    public DataTableService(DataTableDao dataTableDao) {
        this.dataTableDao = dataTableDao;
    }

    /**
     * 数据表分页查询
     */
    public PageData<DataTablePo> selectDataTables(PagingRequestParam<DataTableRequestVo> pagingRequestParam) {
        Page<?> page = PageHelper.startPage(pagingRequestParam.getPage(), pagingRequestParam.getPageSize());
        String schemaName = pagingRequestParam.getRequestVo().getSchemaName();
        String tableName = pagingRequestParam.getRequestVo().getTableName();
        List<DataTablePo> dataTables = dataTableDao.selectDataTables(schemaName, tableName);
        int total = (int) page.getTotal();
        return new PageData<>(dataTables, total, pagingRequestParam.getPageSize(), pagingRequestParam.getPage());
    }
}
