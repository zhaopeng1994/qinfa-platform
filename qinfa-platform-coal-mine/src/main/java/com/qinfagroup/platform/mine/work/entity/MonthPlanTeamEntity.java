package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 月计划施工队明细表 - 抽象实体
 */
@Data
@TableName("work_month_plan_team")
public class MonthPlanTeamEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 月计划ID
	 */
	@TableId
	private Long planId;
	/**
	 * 施工单位ID
	 */
	private Long workTeamId;
	/**
	 * 项目ID
	 */
	private Long projectId;
	/**
	 * 计划进尺（m）
	 */
	private BigDecimal planSpeed;
	/**
	 * 计划煤量（t）
	 */
	private BigDecimal planCoalNumber;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
