package com.yunfy.learning.patterns.adapter;

import java.util.List;

/**
 * @author yunfy
 * @create 2019-03-26 21:52
 **/
public class LogDbOperate implements LogDbOperateApi {
    /**
     * 需要新增的日志对象
     *
     * @param lm 日志对象
     */
    @Override
    public void createLog(LogModel lm) {
        System.out.println("now in LogDbOperate createLog,lm=" + lm);
    }

    /**
     * 修改日志
     *
     * @param lm 需要修改的日志对象
     */
    @Override
    public void updateLog(LogModel lm) {
        System.out.println("now in LogDbOperate updateLog,lm=" + lm);
    }

    /**
     * 删除日志
     *
     * @param lm 需要删除的日志对象
     */
    @Override
    public void removeLog(LogModel lm) {
        System.out.println("now in LogDbOperate removeLog,lm=" + lm);
    }

    /**
     * 获取所有的日志
     *
     * @return 所有的日志对象
     */
    @Override
    public List<LogModel> getAllLog() {
        System.out.println("now in LogDbOperate getAllLog");
        return null;
    }
}
