package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 工作面月度汇总表 - 抽象实体
 */
@Data
@TableName("work_project_sum")
public class ProjectSumEntity extends AbstractEntity implements Serializable {
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
	 * 月度累计推进（m）
	 */
	private BigDecimal totalSpeed;
	/**
	 * 月度累计主运顺槽推进（m）
	 */
	private BigDecimal totalMainSpeed;
	/**
	 * 月度累计辅运顺槽推进（m）
	 */
	private BigDecimal totalSecondSpeed;
	/**
	 * 月度累计采出煤量（t）
	 */
	private BigDecimal totalCoalNumber;
	/**
	 * 锁标志位
	 */
	private Integer lock;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
