package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 施工项目表 - 抽象实体
 */
@Data
@TableName("work_project")
public class ProjectEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 开采业务ID
	 */
	@TableId
	private Long businessId;
	/**
	 * 项目编号
	 */
	private String code;
	/**
	 * 项目名称
	 */
	private String name;
	/**
	 * 项目类型
	 */
	private Long type;
	/**
	 * 煤岩类型
	 */
	private Long coalRockType;
	/**
	 * 项目状态：1-计划中；2-进行中；3-已完成
	 */
	private Integer status;

}
