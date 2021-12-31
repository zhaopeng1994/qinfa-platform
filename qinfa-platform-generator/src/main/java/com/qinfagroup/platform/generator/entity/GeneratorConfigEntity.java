package com.qinfagroup.platform.generator.entity;

import com.qinfagroup.platform.common.entity.AbstractEntity;

/**
 * 生成器配置信息实体
 *
 * @author peng.zhao
 */
public class GeneratorConfigEntity extends AbstractEntity {

    /**
     * Schema ID
     */
    private Long schemaId;

    /**
     * 数据表前缀
     * 生成器生成代码会忽略表前缀
     */
    private String tablePrefix;

    /**
     * 主路径
     */
    private String mainPath;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 模块名
     */
    private String moduleName;

    /**
     * 实体超类
     */
    private String entitySuperClass;

    /**
     * author 信息
     */
    private String author;

    /**
     * 邮箱信息
     */
    private String email;

    public Long getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public String getMainPath() {
        return mainPath;
    }

    public void setMainPath(String mainPath) {
        this.mainPath = mainPath;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getEntitySuperClass() {
        return entitySuperClass;
    }

    public void setEntitySuperClass(String entitySuperClass) {
        this.entitySuperClass = entitySuperClass;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
