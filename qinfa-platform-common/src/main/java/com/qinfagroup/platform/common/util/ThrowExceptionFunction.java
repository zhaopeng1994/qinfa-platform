package com.qinfagroup.platform.common.util;

/**
 * 抛异常接口
 */
@FunctionalInterface
public interface ThrowExceptionFunction {

    /**
     * 抛出异常信息
     */
   void throwMessage(String message);

}
