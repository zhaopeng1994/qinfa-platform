package com.qinfagroup.platform.generator.entity;

/**
 * 数据表列的抽象实体
 * @author peng.zhao
 */
public class ColumnEntity {
	/**
	 * 数据列名
	 */
    private String columnName;
	/**
	 * 数据类型
	 */
	private String dataType;
	/**
	 * 注释信息
	 */
	private String comments;
	/**
	 * 映射成员属性，如：user_name => userName
	 */
    private String attrName;
	/**
	 * 属性类型
	 */
	private String attrType;
	/**
	 * auto_increment
	 */
	private String extra;
    
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public String getAttrType() {
		return attrType;
	}
	public void setAttrType(String attrType) {
		this.attrType = attrType;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
}
