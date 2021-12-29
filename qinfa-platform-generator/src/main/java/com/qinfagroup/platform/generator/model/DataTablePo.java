package com.qinfagroup.platform.generator.model;

/**
 * 数据表持久层对象
 * @author peng.zhao
 */
public class DataTablePo {

    /**
     * 数据表名
     */
    private String tableName;

    /**
     * 存储引擎
     */
    private String engine;

    /**
     * 数据表注释
     */
    private String tableComment;

    /**
     * 创建时间
     */
    private String createTime;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
