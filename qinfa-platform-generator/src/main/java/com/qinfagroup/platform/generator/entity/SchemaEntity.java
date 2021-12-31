package com.qinfagroup.platform.generator.entity;

import com.qinfagroup.platform.common.entity.AbstractEntity;

import javax.validation.constraints.NotBlank;

/**
 * 数据库Schema信息实体
 * @author peng.zhao
 */
public class SchemaEntity extends AbstractEntity {

    /**
     * IP地址
     */
    private String ip;

    /**
     * 端口
     */
    private String port;

    /**
     * SchemaName
     */
    @NotBlank(message = "schema名称不能为空")
    private String name;

    /**
     * 说明
     */
    private String comments;

    /**
     * 是否作废
     */
    private Integer isDeleted;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
