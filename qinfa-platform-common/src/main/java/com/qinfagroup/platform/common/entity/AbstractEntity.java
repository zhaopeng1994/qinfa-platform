package com.qinfagroup.platform.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

/**
 * 抽象实体类
 * @author peng.zhao
 */
public abstract class AbstractEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "created_time", exist = true)
    private LocalDateTime createdTime;

    @TableField(value = "created_user", exist = true)
    private String createdUser;

    @TableField(value = "updated_time", exist = true)
    private LocalDateTime updatedTime;

    @TableField(value = "updated_user", exist = true)
    private String updatedUser;

}
