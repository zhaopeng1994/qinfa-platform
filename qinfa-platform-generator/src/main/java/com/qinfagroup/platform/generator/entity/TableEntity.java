package com.qinfagroup.platform.generator.entity;

import java.util.List;

/**
 * 数据表抽象实体
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
	 * 数据列
	 */
	private List<ColumnEntity> columns;

	/**
	 * 映射类名：如：sys_user => SysUser
	 */
	private String className;

	/**
	 * 映射类名，第一个字母小写，如：sys_user => sysUser
	 */
	private String classname;
	
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
	public List<ColumnEntity> getColumns() {
		return columns;
	}
	public void setColumns(List<ColumnEntity> columns) {
		this.columns = columns;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
}
