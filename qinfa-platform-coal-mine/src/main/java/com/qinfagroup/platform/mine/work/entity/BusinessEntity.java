package com.qinfagroup.platform.mine.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 开采业务表 - 抽象实体
 */
@Data
@TableName("work_business")
public class BusinessEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 煤矿ID
	 */
	@TableId
	private Long coalMineId;
	/**
	 * 原煤类型ID
	 */
	private Long rowCoalTypeId;
	/**
	 * 是否开采中：0-否；1-是
	 */
	private Integer isMining;
	/**
	 * 是否需要发布日报：0-否；1-是
	 */
	private Integer isNeedPublish;

}
