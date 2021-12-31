package com.qinfagroup.platform.generator.model;

/**
 * 代码生成属性配置类
 *
 * @author peng.zhao
 */
public class GeneratorAttributeRequestVo {

    /**
     * Schema ID
     */
    private Long schemaId;

    /**
     * 数据表前缀
     * 生成器生成代码会忽略表前缀
     */
    private String tablePrefix;

    /**
     * 主路径
     */
    private String mainPath;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 模块名
     */
    private String moduleName;

    /**
     * 实体超类
     */
    private String entitySuperClass;

    /**
     * author 信息
     */
    private String author;

    /**
     * 邮箱信息
     */
    private String email;

}
