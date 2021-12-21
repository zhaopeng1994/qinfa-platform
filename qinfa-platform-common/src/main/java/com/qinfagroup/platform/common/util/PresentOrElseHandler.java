package com.qinfagroup.platform.common.util;

import java.util.function.Consumer;

@FunctionalInterface
public interface PresentOrElseHandler<T> {

    /**
     * 值不为空时执行消费操作
     * 值为空时执行其他的操作
     */
    void presentOrElseHandle(Consumer<? super T> consumer, Runnable emptyAction);
}
