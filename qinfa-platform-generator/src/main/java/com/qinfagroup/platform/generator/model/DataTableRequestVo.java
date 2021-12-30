package com.qinfagroup.platform.generator.model;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 数据表查询抽象类
 * @author peng.zhao
 */
public class DataTableRequestVo implements Serializable {
    private static final long serialVersionUID = 6876118003230259301L;

    /**
     * 数据库名
     */
    @NotBlank(message = "schema不能为空")
    private String schemaName;

    /**
     * 数据表名
     */
    private String tableName;

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
