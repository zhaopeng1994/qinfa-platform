package com.qinfagroup.platform.common.page;


/**
 * 查询参数封装对象
 * @author peng.zhao
 */
public class QueryParam<T> {

    /**
     * 页码
     */
    private int page;

    /**
     * 页记录数
     */
    private int pageSize;

    private T requestVo;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public T getRequestVo() {
        return requestVo;
    }

    public void setRequestVo(T requestVo) {
        this.requestVo = requestVo;
    }
}
