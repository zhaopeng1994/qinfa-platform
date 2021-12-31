package com.qinfagroup.platform.common;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class AbstractEntityTest {

    @Test
    public void testConflictAbstractEntity() {
        String className = "com.qinfagroup.platform.common.pojo.AbstractEntity";
        try {
            Class clazz = Class.forName(className);
            Field[] declaredFields = clazz.getDeclaredFields();
            Map<String, Type> fieldMap = Arrays.stream(declaredFields).collect(Collectors.toMap(Field::getName, Field::getGenericType, (k1, k2) -> k1));
            String updatedTime = fieldMap.get("updatedTime").getTypeName();
            System.out.println(updatedTime);
            System.out.println(className.substring(className.lastIndexOf(".") + 1));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testStringSubstring() {
        String comments = "生产计划表";
        System.out.println(StringUtils.endsWith(comments, "表") ? StringUtils.substringBeforeLast(comments,"表") : comments);
    }

}
