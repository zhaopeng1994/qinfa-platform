package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 工作面进度表 - 抽象实体
 */
@Data
@TableName("work_project_speed")
public class ProjectSpeedEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 开采月计划ID
	 */
	@TableId
	private Long planId;
	/**
	 * 施工日期
	 */
	private LocalDate workDate;
	/**
	 * 开采项目ID
	 */
	private Long projectId;
	/**
	 * 主运顺槽推进（m）
	 */
	private BigDecimal mainSpeed;
	/**
	 * 辅助顺槽推进（m）
	 */
	private BigDecimal secondSpeed;
	/**
	 * 采出煤量（t）
	 */
	private BigDecimal coalNumber;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
