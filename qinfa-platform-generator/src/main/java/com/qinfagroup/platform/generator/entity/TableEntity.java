package com.qinfagroup.platform.generator.entity;

import java.util.List;

/**
 * 数据表抽象实体
 * @author peng.zhao
 */
public class TableEntity {
	/**
	 * 表名
	 */
	private String tableName;

	/**
	 * 表注释
	 */
	private String comments;

	/**
	 * 表主键
	 */
	private ColumnEntity pk;

	/**
	 * 映射类名：如：sys_user => SysUser
	 */
	private String className;

	/**
	 * 映射实例名，如：sys_user => sysUser
	 */
	private String instanceName;
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public ColumnEntity getPk() {
		return pk;
	}
	public void setPk(ColumnEntity pk) {
		this.pk = pk;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
}
