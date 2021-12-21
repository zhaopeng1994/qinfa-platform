package com.qinfagroup.platform.generator.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 亚索
 **/
public class MongoCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String database = context.getEnvironment().getProperty("renren.database");
        return "mongodb".equalsIgnoreCase(database);
    }
}
