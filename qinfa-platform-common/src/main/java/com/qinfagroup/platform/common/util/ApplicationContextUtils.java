package com.qinfagroup.platform.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class ApplicationContextUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Optional.ofNullable(applicationContext).ifPresent(item -> ApplicationContextUtils.applicationContext = item);
    }

    private static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 根据name获取bean
     * @param name bean name
     * @return bean
     */
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    /**
     * 根据class获取bean
     * @param clazz bean class
     * @param <T> 泛型
     * @return bean
     */
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    /**
     * 根据name、class获取bean
     * @param name bean name
     * @param clazz bean class
     * @param <T> 泛型
     * @return bean
     */
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }

    /**
     * 获取当前激活环境
     */
    public static String getActiveProfile() {
        return Arrays.toString(applicationContext.getEnvironment().getActiveProfiles());
    }
}
