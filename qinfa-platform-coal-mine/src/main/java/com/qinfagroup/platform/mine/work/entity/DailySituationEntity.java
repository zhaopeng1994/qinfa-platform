package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDate;
import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 日生产情况表 - 抽象实体
 */
@Data
@TableName("work_daily_situation")
public class DailySituationEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 业务ID
	 */
	@TableId
	private Long businessId;
	/**
	 * 业务日期
	 */
	private LocalDate businessDate;
	/**
	 * 影响
	 */
	private String effect;
	/**
	 * 机运情况
	 */
	private String machine;
	/**
	 * 通风情况
	 */
	private String air;
	/**
	 * 钻机情况
	 */
	private String rig;
	/**
	 * 施工单位情况
	 */
	private String team;
	/**
	 * 工作面情况
	 */
	private String project;
	/**
	 * 总结
	 */
	private String summary;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
