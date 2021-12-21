package com.qinfagroup.platform.mine.base.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 煤矿类型基表 - 抽象实体
 */
@Data
@TableName("base_coal_mine_type")
public class CoalMineTypeEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 类型名称
	 */
	@TableId
	private String name;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
