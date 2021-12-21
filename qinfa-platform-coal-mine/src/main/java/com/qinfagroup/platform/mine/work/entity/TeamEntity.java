package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 施工单位表 - 抽象实体
 */
@Data
@TableName("work_team")
public class TeamEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 开采业务ID
	 */
	@TableId
	private Long businessId;
	/**
	 * 施工单位名称
	 */
	private String name;
	/**
	 * 施工单位类型
	 */
	private Long type;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
