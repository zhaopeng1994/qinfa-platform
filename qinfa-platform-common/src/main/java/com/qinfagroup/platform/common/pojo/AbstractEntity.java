package com.qinfagroup.platform.common.pojo;

import com.baomidou.mybatisplus.annotation.TableField;

import java.time.LocalDateTime;

/**
 * 抽象实体类
 */
public abstract class AbstractEntity {

    @TableField
    private Long id;

    private LocalDateTime createdTime;

    private String createdUser;

    private LocalDateTime updatedTime;

    private String updatedUser;

}
