package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 月计划表 - 抽象实体
 */
@Data
@TableName("work_month_plan")
public class MonthPlanEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 开采业务ID
	 */
	@TableId
	private Long businessId;
	/**
	 * 计划年月
	 */
	private String planYearMonth;
	/**
	 * 计划状态：1-未提交；2-已提交；3-审核通过；4-审核失败
	 */
	private Integer status;
	/**
	 * 计划类型：1-原始计划；2-调整计划
	 */
	private Integer type;
	/**
	 * 审批内容
	 */
	private String content;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
