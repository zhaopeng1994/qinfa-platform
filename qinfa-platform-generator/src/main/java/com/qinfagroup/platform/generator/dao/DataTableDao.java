package com.qinfagroup.platform.generator.dao;

import com.qinfagroup.platform.generator.model.DataTablePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataTableDao {

    List<DataTablePo> selectDataTables(@Param("schemaName") String schemaName, @Param("tableName") String tableName);

}
