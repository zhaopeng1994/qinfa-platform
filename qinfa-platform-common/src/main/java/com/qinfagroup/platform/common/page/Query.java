package com.qinfagroup.platform.common.page;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qinfagroup.platform.common.util.BranchUtils;
import com.qinfagroup.platform.common.util.Constants;
import com.qinfagroup.platform.common.xss.SQLFilter;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * 查询参数工具类
 * @param <T>
 */
public class Query<T> {

    public IPage<T> getPage(Map<String, Object> params) {
        return this.getPage(params, null, false);
    }

    public IPage<T> getPage(Map<String, Object> params, String defaultOrderField, boolean isAsc) {
        // 分页参数
        long curPage = 1;
        long limit = 10;

        if (params.get(Constants.PAGE) != null) {
            curPage = Long.parseLong((String)params.get(Constants.PAGE));
        }

        if(params.get(Constants.LIMIT) != null){
            limit = Long.parseLong((String)params.get(Constants.LIMIT));
        }

        // 分页对象
        Page<T> page = new Page<>(curPage, limit);

        // 分页参数
        params.put(Constants.PAGE, page);

        // 排序字段
        // 防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
        String orderField = SQLFilter.sqlInject((String)params.get(Constants.ORDER_FIELD));
        String order = (String)params.get(Constants.ORDER);

        // 前端字段排序
        if (StringUtils.isNotEmpty(orderField) && StringUtils.isNotEmpty(order)) {
            if (Constants.ASC.equalsIgnoreCase(order)) {
                return page.addOrder(OrderItem.asc(orderField));
            } else {
                return page.addOrder(OrderItem.desc(orderField));
            }
        }

        // 没有排序字段，则不排序
        if (StringUtils.isBlank(defaultOrderField)) {
            return page;
        }

        BranchUtils.isTureOrFalse(isAsc).trueOrFalseHandle(() -> page.addOrder(OrderItem.asc(defaultOrderField)),
                () -> page.addOrder(OrderItem.desc(defaultOrderField)));

        return page;
    }

}
