package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 施工单位月度汇总表 - 抽象实体
 */
@Data
@TableName("work_team_sum")
public class TeamSumEntity extends AbstractEntity implements Serializable {
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
	 * 开采项目ID
	 */
	private Long projectId;
	/**
	 * 月度累计进尺（m）
	 */
	private BigDecimal monthTotalSpeed;
	/**
	 * 年度累计进尺（m）
	 */
	private BigDecimal yearTotalSpeed;
	/**
	 * 月度累计煤量（t）
	 */
	private BigDecimal monthTotalCoalNumber;
	/**
	 * 年度累计煤量（t）
	 */
	private BigDecimal yearTotalCoalNumber;
	/**
	 * 锁标志位
	 */
	private Integer lock;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
