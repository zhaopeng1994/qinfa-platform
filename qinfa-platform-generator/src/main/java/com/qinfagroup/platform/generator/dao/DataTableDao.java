package com.qinfagroup.platform.generator.dao;

import com.qinfagroup.platform.generator.model.DataTablePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataTableDao {

    /**
     * 查询指定schema中的所有数据表
     * @param schemaName schema
     * @param tableName table
     * @return List<DataTablePo>
     */
    List<DataTablePo> selectDataTables(@Param("schemaName") String schemaName, @Param("tableName") String tableName);

}
