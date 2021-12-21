package com.qinfagroup.platform.mine.base.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.qinfagroup.platform.common.entity.AbstractEntity;
import java.io.Serializable;
import lombok.Data;

/**
 * 原煤类型基表 - 抽象实体
 */
@Data
@TableName("base_raw_coal_type")
public class RawCoalTypeEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 名称
	 */
	@TableId
	private String name;
	/**
	 * 别名
	 */
	private String alias;
	/**
	 * 分类依据：1-炭化程度；2-成因；3-业务
	 */
	private Integer basis;
	/**
	 * 是否作废：0-否；1-是
	 */
	private Integer isDeleted;

}
