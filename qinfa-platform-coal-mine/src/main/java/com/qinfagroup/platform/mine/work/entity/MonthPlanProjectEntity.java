package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 月计划工作面明细表 - 抽象实体
 */
@Data
@TableName("work_month_plan_project")
public class MonthPlanProjectEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 月计划ID
	 */
	@TableId
	private Long planId;
	/**
	 * 项目ID
	 */
	private Long projectId;
	/**
	 * 工作面长度（m）
	 */
	private BigDecimal length;
	/**
	 * 煤层厚度（m）
	 */
	private BigDecimal thickness;
	/**
	 * 纵向长度（m）
	 */
	private BigDecimal portraitLength;
	/**
	 * 累计推进（m）
	 */
	private BigDecimal totalSpeed;
	/**
	 * 可采储量（t）
	 */
	private BigDecimal maxCoalNumber;
	/**
	 * 采出煤量（t）
	 */
	private BigDecimal totalCoalNumber;
	/**
	 * 主运顺槽累计推进（m）
	 */
	private BigDecimal totalMainSpeed;
	/**
	 * 辅助顺槽累计推进（m）
	 */
	private BigDecimal totalSecondSpeed;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
