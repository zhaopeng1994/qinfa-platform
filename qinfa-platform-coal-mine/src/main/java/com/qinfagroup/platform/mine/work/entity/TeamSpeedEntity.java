package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 施工单位进度表 - 抽象实体
 */
@Data
@TableName("work_team_speed")
public class TeamSpeedEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 开采月计划ID
	 */
	@TableId
	private Long planId;
	/**
	 * 业务日期
	 */
	private LocalDate businessDate;
	/**
	 * 施工单位ID
	 */
	private Long workTeamId;
	/**
	 * 开采项目ID
	 */
	private Long projectId;
	/**
	 * 日进尺（m）
	 */
	private BigDecimal speed;
	/**
	 * 日煤量（m）
	 */
	private BigDecimal coalNumber;
	/**
	 * 日进尺月超欠（m）
	 */
	private BigDecimal speedOver;
	/**
	 * 日煤量月超欠（t）
	 */
	private BigDecimal coalNumberOver;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
