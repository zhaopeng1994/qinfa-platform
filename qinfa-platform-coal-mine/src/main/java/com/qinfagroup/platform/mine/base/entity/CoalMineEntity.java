package com.qinfagroup.platform.mine.base.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.qinfagroup.platform.common.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 煤矿表 - 抽象实体
 * @author peng.zhao
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("base_coal_mine")
public class CoalMineEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 煤矿编号
	 */
	private String code;
	/**
	 * 煤矿名称
	 */
	private String name;
	/**
	 * 区域位置
	 */
	private String area;
	/**
	 * 类型
	 */
	private Long type;
	/**
	 * 是否启用：0-否；1-是
	 */
	private Integer isEnabled;

}
