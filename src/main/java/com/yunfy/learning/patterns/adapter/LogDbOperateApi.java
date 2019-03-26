package com.yunfy.learning.patterns.adapter;

import java.util.List;

/**
 * 日志文件操作数据库接口
 *
 * @author yunfy
 **/
public interface LogDbOperateApi {

    /**
     * 需要新增的日志对象
     *
     * @param lm 日志对象
     */
    void createLog(LogModel lm);

    /**
     * 修改日志
     *
     * @param lm 需要修改的日志对象
     */
    void updateLog(LogModel lm);

    /**
     * 删除日志
     *
     * @param lm 需要删除的日志对象
     */
    void removeLog(LogModel lm);

    /**
     * 获取所有的日志
     *
     * @return 所有的日志对象
     */
    List<LogModel> getAllLog();
}
